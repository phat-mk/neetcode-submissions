class TimeMap {

    class Pair {
        int time;
        String value;

        public Pair(int time, String value) {
            this.time = time;
            this.value = value;
        }
    }

    private HashMap<String, List<Pair>> hashmap;

    public TimeMap() {  
        hashmap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hashmap.containsKey(key)) {
            hashmap.put(key, new ArrayList<>());
            hashmap.get(key).add(new Pair(timestamp, value));
        } else {
            hashmap.get(key).add(new Pair(timestamp, value));
        }
    }
    
    public String get(String key, int timestamp) {

        if (!hashmap.containsKey(key)) return "";

        List<Pair> listItem = hashmap.get(key);

        String result = "";
        if(listItem.size() == 0) {
            return result;
        } else {
            int left = 0, right = listItem.size() - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (listItem.get(mid).time <= timestamp) {
                    result = listItem.get(mid).value;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return result;
    }
}