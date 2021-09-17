public class Main {
    public static void main(String[] args) {
        new JobScheduler_LeetCode().leastInterval(new char[]{'A','A','A','A','A','A','B','C','D','E','F','G'},2);
        new PriorityQueueImplementation_basic().testing();
      //  new BeautifulNumbers_PAYPAL().solve(31,32);
      //  new SpiralMatrixWithPattern(5,"UUDDLLRR").doSpiral();
        /*char[][] board2={"CAA".toCharArray(),"AAA".toCharArray(),"BCD".toCharArray()};
        new WordSearch().exist(board2,"AAB");*/
       /* int graph[][] = new int[][]{{0, 30, 0, 0, 0},
                {0, 0, 20, 30, 100},
                {0, 0, 0, 0, 5},
                {0, 0, 0, 0, 5},
                {0, 0, 0, 0, 0},
        };
        new DjikstrasAlgorithm().dijkstra(graph, 0);*/
    //    new ScheduleJob_2_DFS().findMin(new int[]{7,1,7,1,7,1},3);
     //   new ScheduleJob(new int[]{7,1,7,1,7,1},3).MinimumSchedule();
      //  new ScheduleJob(new int[]{6,5,4,3,2,1},2).MinimumSchedule();
      //  new ScheduleJob(new int[]{11,111,22,222,33,333,44,444},6).MinimumSchedule();
        char[][] board={{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        new SUDOKU().solveSudoku(board);
    }
}
