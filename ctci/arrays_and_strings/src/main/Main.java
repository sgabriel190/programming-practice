package main;

public class Main {

    public static void main(String[] args) {
	    Solution solution = new Solution();
	    System.out.println(solution.p1("abc"));
        System.out.println(solution.p2("abc", "acw"));
        System.out.println(solution.p3("a  bc    "));
        System.out.println(solution.p4("aaaa"));
        System.out.println(solution.p5("pale", "ple"));
        System.out.println(solution.p6("aabcccccaaa"));
        System.out.println(solution.p7(new int[5][5]));
        solution.p8(new int[5][6]);
        System.out.println(solution.p9("waterbottle", "waterebottl"));
    }
}
