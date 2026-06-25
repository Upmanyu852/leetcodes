class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();

        // Step 1: saare indexes apni-apni queue mein daalo
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                rQueue.offer(i);
            } else {
                dQueue.offer(i);
            }
        }

        // Step 2: jab tak dono queues mein senators hain, fight karte raho
        while (!rQueue.isEmpty() && !dQueue.isEmpty()) {
            int rIndex = rQueue.poll();
            int dIndex = dQueue.poll();

            // Jo PEHLE aata hai (chhota index), woh jeetega
            if (rIndex < dIndex) {
                rQueue.offer(rIndex + n);   // R jeeta, agle round ke liye wapas daalo
            } else {
                dQueue.offer(dIndex + n);   // D jeeta, agle round ke liye wapas daalo
            }
        }

        // Step 3: jo queue bachi hai, wahi jeeti
        return rQueue.isEmpty() ? "Dire" : "Radiant";
    }
}