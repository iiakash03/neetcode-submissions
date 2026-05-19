class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<9;i++){
            map=new HashMap<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(map.containsKey(board[i][j])){
                    System.out.println("first "+board[i][j]);
                    return false;
                }else{
                    map.put(board[i][j],1);
                }
            }
        }

        for(int i=0;i<9;i++){
            map=new HashMap<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.'){
                    continue;
                }
                if(map.containsKey(board[j][i])){
                    System.out.println("second");
                    return false;
                }else{
                    map.put(board[j][i],1);
                }
            }
        }

        int r=0;int c=0;

        int[][] dir = {{0,0},{0,3},{0,6},{3,0},{3,3},{3,6},{6,0},{6,3},{6,6}};

        for(int i=0;i<9;i++){
            map=new HashMap<>();
            int row=dir[i][0];
            int col=dir[i][1];
            for(int j=row;j<=row+2;j++){
                for(int k=col;k<=col+2;k++){

                 if(board[j][k]=='.'){
                    continue;
                 }
                    if(map.containsKey(board[j][k])){
                        System.out.println("third"+ j +"jk" + k);
                        return false;
                    }else{
                        map.put(board[j][k],1);
                    }
                }
            }
        }

        return true;
    }


}
