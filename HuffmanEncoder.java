public class HuffmanEncoder {

   
    // Node implementation for building the Huffman tree.
    private class Node implements Comparable<Node>{
        public Node left, right;
        public Character c;
        public int count;

        public Node(Character c, int count) {
            this.c = c;
            this.count = count;
            left = right = null;
        }

        @Override
        public int compareTo(Node o) {
            return count - o.count;
        }

        @Override
        public String toString() {
            if(c == null) { return "null-" + count; }
            return c.toString() + "-" + count;
        }
    }


    public HuffmanEncoder() {
    }

    /**
     * Huffman Part 1: 
     *
     * Generates:
     *      1) Huffman tree
     *      2) Encoded version of same
     *      3) Character bit strings
     *      4) Encoded version of string
     *
     * @param s -- String to be Huffman encoded
     */
    public void encode(String s) {
        return;
    }


    /**
     * Huffman Part 2: 
     *
     * The string encoding uses the actual letter rather than an
     * ASCII code. So if you are outputting a capital letter A, write "A",
     * not 65.
     *
     * @return String encoding of Huffman tree
     */
    public String getEncodedTree() {
        return null;
    }

    /**
     * Huffman Part 3: Implement this
     *
     * Returns an array of encoded bit strings.
     * Array should have 256 entries (one for each character value 0-255).
     * Entries that correspond to a character in the input should contain
     * the bitstring for that character.
     * Entries whose characters are not in the input should be null.
     *
     *
     * @return array of encoded bit strings
     */
    public String[] getBitStrings() {
        return null;
    }

    /**
     * Huffman Part 4: Implement this
     *
     * Returns a string corresponding to the Huffman encoding of the
     * string provided to encode(). String should contain only '0's
     * and '1's (i.e. be binary). Other characters will be considered
     * incorrect.
     *
     * @return 'bit' encoding of overall string
     */
    public String getEncodedText() {
        // TODO: implement this
        return null;
    }


    public static void main(String args[]) {
        HuffmanEncoder he = new HuffmanEncoder();

        he.encode("ABRACADABRA!");
        System.out.println(he.getEncodedTree());
        System.out.println(he.getEncodedText());
        System.out.println(he.getEncodedText().length() + " <-- should be 28");
    }

}

class MinHeapPriorityQueue<I extends Comparable<I>> implements PriorityQueue<I> {
    // Java doesn't like creating arrays of generic types
    private I[] heap;
    private int N;      // number of elements in the heap

    // Java would normally warn us about the cast below.
    // this directive keeps that from happening
    @SuppressWarnings("unchecked")
    public MinHeapPriorityQueue() {
        N = 0;
        heap = (I[]) new Comparable[1];
    }

    /**
     * Priority Queue Part 1: 
     *
     * Insert an item into the priority queue, performing
     * sift/swim operations as appropriate. *Must* maintain
     * a heap array.
     *
     * Make a call to resize() when you need to resize the array
     *
     * @param item -- Item to insert into the queue
     */
    @Override public void insert(I item) {
        return;
    }

    /**
     * Priority Queue Part 2:
     *
     * Extract the next item from queue, perform appropriate sift/swim
     * operations, and return the item. *Must* maintain a heap array.
     *
     * @return Item with highest priority (i.e. one with lowest value)
     */
    @Override public I delNext() {
        return null;
    }

    /**
     * Use N to track number of items in the heap.
     * @return number of items in the heap
     */
    @Override public int size() {
        return N;
    }

    /**
     * Doubles the size of the heap array. Takes care of allocating
     * memory and moving everything.
     * Call this from insert when you need more array space.
     */
    private void resize() {
        @SuppressWarnings("unchecked")
        I[] newHeap = (I[]) new Comparable[heap.length * 2];
        for(int i = 0; i < N; i++) {
            newHeap[i] = heap[i];
        }
        heap = newHeap;
    }

    /**
     * Returns a stringified version of the array
     *
     * @return a comma-separated list of array values, wrapped in brackets
     */
    @Override public String toString() {
        if(N == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < N-1; i++) {
            sb.append(heap[i] + ",");
        }
        sb.append(heap[N-1] + "]");
        return sb.toString();
    }

    public static void main(String args[]) {
        MinHeapPriorityQueue<Integer> pq = new MinHeapPriorityQueue<>();

        pq.insert(5);
        pq.insert(11);
        pq.insert(8);
        pq.insert(4);
        pq.insert(3);
        pq.insert(15);
        System.out.println(pq + " <-- should be [3,4,8,11,5,15]");

        for(int i = 0; i < 6; i++) {
            System.out.println(pq.delNext());
        }
    }
}
