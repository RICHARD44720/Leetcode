class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if(a[0]==b[0])return a[1]-b[1];
            return b[0]-a[0];
        });
        List<int[]> list=new ArrayList<>();
        for(int[] p:people){
            list.add(p[1],p);
        }
        int queue[][]=new int[people.length][people[0].length];
        for(int i=0;i<list.size();i++){
            queue[i]=list.get(i);
        }
        return queue;
    }
}