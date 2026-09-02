class Solution {
    public int[][] kClosest(int[][] points, int k) {  
    PriorityQueue<int[]> prio = new PriorityQueue<>((a, b) ->  Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1])); // max heap, compare the squared distances, top of heap is the biggest squared distance

    for(int[] point: points){
        prio.offer(point);

        if(prio.size() > k){ //if heap size > k, remove largest distance from heap,
            prio.poll();
        }
    }

    int[][] result = new int[k][2];
    for(int i=0; i<k; i++){
        result[i] = prio.poll();
    }      

    return result;
    }
}
