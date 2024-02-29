import java.util.List;
public class Solution {
    public static int pop(List<Integer> heap) {
        // Write you code here.
        if(heap.size()==0)
            return -1;
        int data=heap.get(0);
        int temp=heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.set(heap.size()-1,temp);
        heap.remove(heap.size()-1);
        heapify(heap,0);
        return data;
        /*if(heap.size()==0)
        return ans;

        int pos=0;
        while(true)
        {
            int left=pos*2+1;
            int right=2*pos+2;
           // int minidx=pos;
            if(left<heap.size()&&heap.get(left)>heap.get(pos))
            {
                int temp=heap.get(pos);
                heap.set(pos,heap.get(pos));
                heap.set(pos,temp);
                pos=left;
            }
            if(left<heap.size()&&heap.get(left)>heap.get(pos))
            {
                int temp=heap.get(pos);
                heap.set(pos,heap.get(pos));
                heap.set(pos,temp);
                pos=right;
            }*/
            
        }

        public static void heapify(List<Integer> heap,int i)
        {
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;
            if((left<heap.size())&&(heap.get(left)>heap.get(minidx)))
            {
                minidx=left;
            }
            if((right<heap.size())&&(heap.get(right)>heap.get(minidx)))
            {
                minidx=right;
            }
            if(minidx!=i)
            {
                int temp=heap.get(i);
                heap.set(i,heap.get(minidx));
                heap.set(minidx,temp);
                heapify(heap,minidx);
            }
        }

        

    

    // Code Snippet of the push function:
    // public static void push(List<Integer> heap, int x) {
    //         heap.add(x);
    //
    //         // Position of the current inserted element.
    //         int pos = heap.size() - 1;
    //
    //         // Shifting the element up until it reaches the topmost node if it is larger than its parent.
    //         while (pos > 0) {
    //             int parent = (pos - 1) / 2;
    //             if (heap.get(pos) > heap.get(parent)) {
    //                 // Swapping the elements.
    //                 int temp = heap.get(parent);
    //                 heap.set(parent, heap.get(pos));
    //                 heap.set(pos, temp);
    //                 pos = parent;
    //             } else {
    //                 // As parent is larger, the element is now in its correct position.
    //                 break;
    //             }
    //         }
    //     }
}
