/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Queue;
import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(solution(new int[][]{
		    {0,1,1,0},
		    {0,0,0,1},
		    {1,1,0,0},
		    {1,1,1,0}
		    
		}));
	    System.out.println(solution(new int[][]{
	        {0,0,0,0,0,0},
	        {1,1,1,1,1,0},
	        {0,0,0,0,0,0},
	        {0,1,1,1,1,1},
	        {0,1,1,1,1,1},
	        {0,0,0,0,0,0}
	    }));
	    System.out.println(solution(new int[][]{
	        {0,0},
	        {1,0}
	    }));
        System.out.println(solution(new int[][]{
	        {0,1,0},
	        {1,1,0},
            {0,0,0}
	    }));
	    System.out.println(solution(new int[][]{
	        {0,0,0,0,0,0},
	        {1,1,0,1,1,0},
	        {0,0,0,0,0,0},
	        {0,1,1,1,1,1},
	        {0,1,1,1,1,1},
	        {0,0,0,0,0,0}
	    }));
	    System.out.println(solution(new int[][]{
	        {0,0,0,0,0,0},
	        {0,0,0,0,0,0},
	        {0,0,0,0,0,0},
	        {0,0,0,0,0,0},
	        {0,0,0,0,0,0},
	        {0,0,0,0,0,0}
	    }));
        System.out.println(solution(new int[][]{
	        {0,0,0,1,1,0},
	        {1,1,1,0,0,0},
	        {1,1,1,0,0,0},
	        {0,0,0,0,0,0},
	        {0,0,0,0,0,0},
	        {0,0,0,0,0,0}
	    }));
        System.out.println(solution(new int[][]{
	        {0,1,0,0,0,0},
	        {1,1,1,1,1,0},
	        {0,1,1,1,1,0},
	        {0,1,1,1,1,0},
	        {0,1,1,1,1,0},
	        {0,0,0,0,0,0}
	    }));
        System.out.println(solution(new int[][]{
	        {0,1,0,0,0,1},
	        {0,1,0,1,0,1},
	        {0,1,0,1,0,1},
	        {0,1,0,1,0,1},
	        {0,1,0,1,0,1},
	        {0,0,0,1,0,0}
	    }));
	    System.out.println(solution(new int[][]{
	        {0,1,1,1,1,1},
	        {0,0,0,1,1,1},
	        {0,1,0,1,1,1},
	        {0,0,0,1,1,1},
	        {0,1,1,1,1,1},
	        {0,0,0,0,0,0}
	    }));
        System.out.println(solution(new int[][]{
	        {0,1,1,1,1,1},
	        {0,0,0,0,0,0},
	        {1,1,0,1,1,0},
	        {0,0,0,1,1,0},
	        {0,1,1,1,1,0},
	        {0,0,0,0,0,0}
	    }));
        System.out.println(solution(new int[][]{
	        {0,1,1,1,1,1},
	        {0,0,0,0,0,0},
	        {1,1,0,1,1,0},
	        {0,0,0,1,0,0},
	        {0,1,1,1,0,1},
	        {0,0,0,0,0,0}
	    }));
	    System.out.println(solution(new int[][]{
	        {0,1,1,1,1,1},
	        {0,0,0,1,1,1},
	        {0,1,0,1,1,1},
	        {0,0,0,1,1,1},
	        {1,1,1,1,1,1},
	        {0,0,0,0,0,0}
	    }));
	    System.out.println(solution(new int[][]{
	        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	    }));
	    System.out.println(solution(new int[][]{
	        {0,0,0,0,0,0,0,0,0,0},
	        {1,1,1,1,1,0,1,1,1,1},
	        {1,1,1,1,1,0,1,1,1,0},
	        {0,0,0,0,0,0,1,1,1,0},
	        {0,1,1,1,1,1,1,1,1,0},
	        {0,1,1,1,1,1,1,1,1,0},
	        {0,0,0,0,0,0,0,0,0,0}
	    }));
	}
	
    static class Node {
        public int x;
        public int y;
        public Node p = null;
        public Node(int x, int y, Node p) {
            this.x=x;
            this.y=y;
            this.p=p;
        }
    };
    static class WrapperNode {
        public Node head;
        public boolean hasJumped=false;
    }
    private static int increment(int value, int module) {
        return (value+1)%module;
    }
    public static int solution(int[][] map) {
        int rows=map.length;
        int cols=map[0].length;
        int[][] visited = new int[rows][cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                visited[i][j]=0;
            }
        }

        LinkedList<WrapperNode> queue = new LinkedList<WrapperNode>();
        LinkedList<Node> rootReversed = new LinkedList<Node>();
        
        WrapperNode wrapperNode = new WrapperNode();
        wrapperNode.head = new Node(0,0,null);
        wrapperNode.hasJumped=false;
        queue.addLast(wrapperNode);

        while(!queue.isEmpty()) {
            WrapperNode currentWrapper = queue.removeFirst();
            Node current = currentWrapper.head;
            if(current.x==rows-1&&current.y==cols-1) {
                rootReversed.addLast(current);
                visited[current.x][current.y]=1;
            }
            if(visited[current.x][current.y]==1) continue;
            visited[current.x][current.y]=1;

            if(
                isAPossiblePath(map, rows, cols, current.x+1,current.y)==1
            ) {
                WrapperNode tmp = new WrapperNode();
                tmp.head = new Node(current.x+1,current.y, current);
                tmp.hasJumped=currentWrapper.hasJumped;
                queue.addLast(tmp);
            }
            if(
                isAPossiblePath(map, rows, cols, current.x-1,current.y)==1
            ) {
                WrapperNode tmp = new WrapperNode();
                tmp.head = new Node(current.x-1,current.y, current);
                tmp.hasJumped=currentWrapper.hasJumped;
                queue.addLast(tmp);
            }
            if(
                isAPossiblePath(map, rows, cols, current.x,current.y+1)==1
            ) {
                WrapperNode tmp = new WrapperNode();
                tmp.head = new Node(current.x,current.y+1, current);
                tmp.hasJumped=currentWrapper.hasJumped;
                queue.addLast(tmp);
            }
            if(
                isAPossiblePath(map, rows, cols, current.x,current.y-1)==1
            ) {
                WrapperNode tmp = new WrapperNode();
                tmp.head = new Node(current.x,current.y-1, current);
                tmp.hasJumped=currentWrapper.hasJumped;
                queue.addLast(tmp);
            }

            if(currentWrapper.hasJumped==true) continue;

            if(
                isAPossiblePath(map, rows, cols, current.x+2,current.y)==1&&
                hasWallBetween(current.x,current.y,current.x+2,current.y,map)==1
            ) {
                WrapperNode tmp = new WrapperNode();
                tmp.head = new Node(current.x+2,current.y, current);
                tmp.hasJumped=true;
                queue.addLast(tmp);
            }
            if(
                isAPossiblePath(map, rows, cols, current.x-2,current.y)==1&&
                hasWallBetween(current.x,current.y,current.x-2,current.y,map)==1
            ) {
                WrapperNode tmp = new WrapperNode();
                tmp.head = new Node(current.x-2,current.y, current);
                tmp.hasJumped=true;
                queue.addLast(tmp);
            }
            if(
                isAPossiblePath(map, rows, cols, current.x,current.y+2)==1&&
                hasWallBetween(current.x,current.y,current.x,current.y+2,map)==1
            ) {
                WrapperNode tmp = new WrapperNode();
                tmp.head = new Node(current.x,current.y+2, current);
                tmp.hasJumped=true;
                queue.addLast(tmp);
            }
            if(
                isAPossiblePath(map, rows, cols, current.x,current.y-2)==1&&
                hasWallBetween(current.x,current.y,current.x,current.y-2,map)==1
            ) {
                WrapperNode tmp = new WrapperNode();
                tmp.head = new Node(current.x,current.y-2, current);
                tmp.hasJumped=true;
                queue.addLast(tmp);
            }
        }
        System.out.println("Original map:");
        printMatrix(map);
        System.out.println("Visited map:");
        printMatrix(visited);
        System.out.println(rootReversed.size()+" nodes reached the end");

        int lowerDistance=-1;
        for(int i=0;i<rootReversed.size();i++) {
            if(i==0){
                lowerDistance = getHopCount(rootReversed.get(i));
            } else {
                int tmp = getHopCount(rootReversed.get(i));
                if(tmp<lowerDistance) lowerDistance=tmp;
            }
        }
        return lowerDistance;
    }
    static int getHopCount(Node head) {
        Node tmp = head;
        int counter=0;
        while(tmp!=null) {
            if(tmp.p!=null) {
                if(
                    (tmp.x==tmp.p.x+1&&tmp.y==tmp.p.y)||
                    (tmp.x==tmp.p.x-1&&tmp.y==tmp.p.y)||
                    (tmp.x==tmp.p.x&&tmp.y==tmp.p.y+1)||
                    (tmp.x==tmp.p.x&&tmp.y==tmp.p.y-1)
                ) {
                    counter+=1;
                }
                else {
                    counter+=2;
                }
            } else {
                counter+=1;
            }
            tmp=tmp.p;
        }
        return counter;
    }
    static int isAPossiblePath(int[][] map, int w, int h, int x, int y) {
        if(x>=0&&x<w&&y>=0&&y<h&&map[x][y]==0) return 1;
        return 0;
    }
    static int hasWallBetween(int x1, int y1, int x2, int y2, int[][] map) {
        if(x1<x2&&map[x1+1][y1]==1&&map[x1+2][y1]==0) return 1;
        if(x1>x2&&map[x1-1][y1]==1&&map[x1-2][y1]==0) return 1;
        if(y1<y2&&map[x1][y1+1]==1&&map[x1][y1+2]==0) return 1;
        if(y1>y2&&map[x1][y1-1]==1&&map[x1][y1-2]==0) return 1;
        return 0;
    }
    static int getDWithoutInterval(int x1, int y1, int x2, int y2, Node head) {
        Node tmp = head;
        int stop=0;
        int d=0;
        while(tmp!=null) {
            if((tmp.x==x1&&tmp.y==y1)||(tmp.x==x2&&tmp.y==y2)) {
                stop=(stop+1)%2;
                d+=1;
                if(stop==1) d+=1;
                tmp=tmp.p;
                continue;
                
            }
            if(stop==0) {
                d+=1;
            }
            tmp=tmp.p;
        }
        return d;
    }
    static int isInsideShortestPath(int x1, int y1, int x2, int y2, Node head) {
        int counter=0;
        Node tmp = head;
        while(tmp!=null) {
            if(tmp.x==x1&&tmp.y==y1) counter+=1;
            if(tmp.x==x2&&tmp.y==y2) counter+=1;
            tmp=tmp.p;
        }
        if(counter==2) return 1;
        return 0;
    }
    static void printMatrix(int[][] map) {
        for(int i=0;i<map.length;i++) {
            System.out.print("[");
            for(int j=0;j<map[0].length-1;j++) {
                printBit(map[i][j]);
                System.out.print(",");
            }
            printBit(map[i][map[0].length-1]);
            System.out.println("]");
        }
    }
    static void printBit(int bit) {
        if(bit==0) System.out.print("\u001B[90m"+"\u25A0"+"\u001B[0m");
        else System.out.print("\u001B[32m"+"\u25A0"+"\u001B[0m");
    }
}

