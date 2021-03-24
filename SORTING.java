import java.util.ArrayList;
import java.util.List;

/**
 * 7 Sorting Algorithms:

quick sort
top-down merge sort
bottom-up merge sort
heap sort
selection sort
insertion sort
bubble sort (TLE)
 */
public class SORTING {
     public List<Integer> quickSort(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        quickSort(nums, 0, nums.length - 1);
        for (int i : nums) res.add(i);
        return res;
    }
    private void quickSort(int[] nums, int l, int r) {
        if (l >= r) return;
        int mid = partition(nums, l, r);
        quickSort(nums, l, mid);
        quickSort(nums, mid + 1, r);
    }
    private int partition(int[] nums, int l, int r) {
        int pivot = nums[l];
        while (l < r) {
            while (l < r && nums[r] >= pivot) r--;
            nums[l] = nums[r];
            while (l < r && nums[l] <= pivot) l++;
            nums[r] = nums[l];
        }
        nums[l] = pivot;
        return l;
    }

    //top-down merge sort
    public List<Integer> mergeSort(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        mergeSort(nums, 0, nums.length - 1);
        for (int i : nums) res.add(i);
        return res;
    }
    private void mergeSort(int[] nums, int l, int r) {
        if (l >= r) return;
        int mid = l + (r - l) / 2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);
        merge(nums, l, r);
    }
    private void merge(int[] nums, int l, int r) {
        int mid = l + (r - l) / 2;
        int[] tmp = new int[r - l + 1];
        int i = l, j = mid + 1, k = 0;
        while (i <= mid || j <= r) {
            if (i > mid || j <= r && nums[i] > nums[j]) {
                tmp[k++] = nums[j++];
            } else {
                tmp[k++] = nums[i++];
            }
        }
        System.arraycopy(tmp, 0, nums, l, r - l + 1);
    }

    //bottom-up merge sort
    public List<Integer> mergeBottomSort(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        mergeSort2(nums);
        for (int i : nums) res.add(i);
        return res;
    }
    private void mergeSort2(int[] nums) {
        for (int size = 1; size < nums.length; size *= 2) {
            for (int i = 0; i < nums.length - size; i += 2 * size) {
                int mid = i + size - 1;
                int end = Math.min(i + 2 * size - 1, nums.length - 1);
                merge2(nums, i, mid, end);
            }
        }
    }
    private void merge2(int[] nums, int l, int mid, int r) {
        int[] tmp = new int[r - l + 1];
        int i = l, j = mid + 1, k = 0;
        while (i <= mid || j <= r) {
            if (i > mid || j <= r && nums[i] > nums[j]) {
                tmp[k++] = nums[j++];
            } else {
                tmp[k++] = nums[i++];
            }
        }
        System.arraycopy(tmp, 0, nums, l, r - l + 1);
    }

    //heap sort
    public List<Integer> heap_Sort(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        heapSort(nums);
        for (int i : nums) res.add(i);
        return res;
    }
    private void heapSort(int[] nums) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            heapify(nums, i, nums.length - 1);
        }
        for (int i = nums.length - 1; i >= 1; i--) {
            swap(nums, 0, i);
            heapify(nums, 0, i - 1);
        }
    }
    private void heapify(int[] nums, int i, int end) {
        while (i <= end) {
            int l = 2 * i + 1, r = 2 * i + 2;
            int maxIndex = i;
            if (l <= end && nums[l] > nums[maxIndex]) maxIndex = l;
            if (r <= end && nums[r] > nums[maxIndex]) maxIndex = r;
            if (maxIndex == i) break;
            swap_heap(nums, i, maxIndex);
            i = maxIndex;
        }
    }
    private void swap_heap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


    //Selection Sort
    public List<Integer> selectSort(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        selectionSort(nums);
        for (int i : nums) res.add(i);
        return res;
    }
    private void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) minIndex = j;
            }
            if (minIndex != i) swap_selection(nums, i, minIndex);
        }
    }
    private void swap_selection(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }

    //Insertion sort
    public List<Integer> sortArray(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        insertionSort(nums);
        for (int i : nums) res.add(i);
        return res;
    }
    private void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (nums[j] >= nums[j - 1]) break;
                swap(nums, j, j - 1);
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }

    //buble sort
    public List<Integer> bubble_Sort(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        bubbleSort(nums);
        for (int i : nums) res.add(i);
        return res;
    }
    private void bubbleSort(int[] nums) {
        for (int k = nums.length - 1; k >= 1; k--) {
            for (int i = 0; i < k; i++) {
                if (nums[i] > nums[i + 1]) swap_bubble(nums, i, i + 1);
            }
        }
    }
    private void swap_bubble(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
