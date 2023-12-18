import java.util.Queue;
import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) {
        int[][] map1 = new int[][]{
	        {0,0,0,0,0,0},
	        {1,1,1,1,1,0},
	        {0,0,0,0,0,0},
	        {0,1,1,1,1,1},
	        {0,1,1,1,1,1},
	        {0,0,0,0,0,0}
	    };
        int[][] map2 = new int[][]{
		    {0,1,1,0},
		    {0,0,0,1},
		    {1,1,0,0},
		    {1,1,1,0}
		    
		};
        int[][] map3 = new int[][]{
	        {0,0},
	        {1,0}
	    };
        printAssert(solution(map1), 11);
        printAssert(solution(map2), 7);
        printAssert(solution(map3), 3);
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
	        {0,1,1,0,0,0},
	        {1,0,0,0,0,0},
	        {1,0,0,0,0,0},
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
    static enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
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
                hasPassableWall(current.x,current.y,Direction.RIGHT,map)==1
                //isAPossiblePath(map, rows, cols, current.x+2,current.y)==1&&
                //hasWallBetween(current.x,current.y,current.x+2,current.y,map)==1
            ) {
                WrapperNode tmp = new WrapperNode();
                tmp.head = new Node(current.x+1,current.y, current);
                tmp.hasJumped=true;
                queue.addLast(tmp);
            }
            if(
                hasPassableWall(current.x,current.y,Direction.LEFT,map)==1
                //isAPossiblePath(map, rows, cols, current.x-2,current.y)==1&&
                //hasWallBetween(current.x,current.y,current.x-2,current.y,map)==1
            ) {
                WrapperNode tmp = new WrapperNode();
                tmp.head = new Node(current.x-1,current.y, current);
                tmp.hasJumped=true;
                queue.addLast(tmp);
            }
            if(
                hasPassableWall(current.x,current.y,Direction.DOWN,map)==1
                //isAPossiblePath(map, rows, cols, current.x,current.y+2)==1&&
                //hasWallBetween(current.x,current.y,current.x,current.y+2,map)==1
            ) {
                WrapperNode tmp = new WrapperNode();
                tmp.head = new Node(current.x,current.y+1, current);
                tmp.hasJumped=true;
                queue.addLast(tmp);
            }
            if(
                hasPassableWall(current.x,current.y,Direction.UP,map)==1
                //isAPossiblePath(map, rows, cols, current.x,current.y-2)==1&&
                //hasWallBetween(current.x,current.y,current.x,current.y-2,map)==1
            ) {
                WrapperNode tmp = new WrapperNode();
                tmp.head = new Node(current.x,current.y-1, current);
                tmp.hasJumped=true;
                queue.addLast(tmp);
            }
        }
        /*System.out.println("Original map:");
        printMatrix(map);
        System.out.println("Visited map:");
        printMatrix(visited);
        System.out.println(rootReversed.size()+" nodes reached the end");*/

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

    /**
     * @param x1 x coordinate of the first point
     * @param y1 y coordinate of the first point
     * @param direction direction of the wall relative to bunny position (x1,y1)
     * @return 1 if there is a wall between (x1,y1) and (x2,y2)
     */
    static int hasPassableWall (int x, int y, Direction direction, int[][] map) {
        int rows = map.length;
        int cols = map[0].length;
        /*
         *     0
         *   0 W 0
         * 0 W b W 0
         *   0 W 0
         *     0
         * 0: possible path to follow
         * W: wall that can be destroyed
         * b: position of bunny
         */
        if(direction==Direction.LEFT) {
            if(x-1>=0&&y-1>=0&&map[x-1][y]==1&&map[x-1][y-1]==0) return 1;
            if(x-2>=0&&map[x-1][y]==1&&map[x-2][y]==0) return 1;
            if(x-1>=0&&y+1<cols&&map[x-1][y]==1&&map[x-1][y+1]==0) return 1;
            return 0;
        }
        if(direction==Direction.RIGHT) {
            if(x+1<rows&&y-1>=0&&map[x+1][y]==1&&map[x+1][y-1]==0) return 1;
            if(x+2<rows&&map[x+1][y]==1&&map[x+2][y]==0) return 1;
            if(x+1<rows&&y+1<cols&&map[x+1][y]==1&&map[x+1][y+1]==0) return 1;
            return 0;
        }
        if(direction==Direction.UP) {
            if(x-1>=0&&y-1>=0&&map[x][y-1]==1&&map[x-1][y-1]==0) return 1;
            if(y-2>=0&&map[x][y-1]==1&&map[x][y-2]==0) return 1;
            if(x+1<rows&&y-1>=0&&map[x][y-1]==1&&map[x+1][y-1]==0) return 1;
            return 0;
        }
        if(direction==Direction.DOWN) {
            if(x-1>=0&&y+1<cols&&map[x][y+1]==1&&map[x-1][y+1]==0) return 1;
            if(y+2<cols&&map[x][y+1]==1&&map[x][y+2]==0) return 1;
            if(x+1<rows&&y+1<cols&&map[x][y+1]==1&&map[x+1][y+1]==0) return 1;
            return 0;
        }
        return 0;
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
    static void printAssert(int value, int expected) {
        for(int i=0;i<10;i++) System.out.print("=");
        System.out.print(">  ");
        if(value==expected) System.out.print("\u001B[32m"+"OK"+"\u001B[0m");
        else System.out.print("\u001B[31m"+"FAIL"+"\u001B[0m");
        if(value==expected) System.out.println();
        else System.out.println(" (expected "+expected+", got "+value+")");
    }
}

