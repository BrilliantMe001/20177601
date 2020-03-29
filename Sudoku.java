package Test;

import java.util.Scanner;
public class Sudoku{
    public static int m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      Scanner sc1=new Scanner(System.in);
      m=sc1.nextInt();
        char arr[][] = new char[m][m];
        for(int i = 0; i < m; i++) {
            arr[i] = sc.nextLine().toCharArray();
        }
        dfs(arr, 0, 0);
        sc.close();
    }

    //深度优先搜索
    private static void dfs(char[][] arr, int x, int y) {
        if(x == m){
            print(arr);
            
            System.exit(0);
        }
        if(arr[x][y] == '0'){
            for(int i = 1; i < m+1; i++){
                if(check(arr, x, y, i)){
                    arr[x][y] = (char)('0' + i);
                    dfs(arr, x + (y + 1) / m, (y + 1) % m);
                }
            }
            
            
            arr[x][y] = '0';
        }else{
          
            dfs(arr, x + (y + 1) / m, (y + 1) % m);
        }
    }

    private static boolean check(char[][] arr, int x, int y, int k){

        switch (m){



            case 3:
                for(int i = 0; i < m; i++){
                    if
                    (arr[x][i] == (char)('0' + k) || arr[i][y] == (char)('0' + k))
                    {
                        return false;
                    }

                }
                break;
            case 5:
                for(int i = 0; i < m; i++){
                    if
                    (arr[x][i] == (char)('0' + k) || arr[i][y] == (char)('0' + k))
                    {
                        return false;
                    }

                }
                break;
            case 7:
                for(int i = 0; i < m; i++){
                    if
                    (arr[x][i] == (char)('0' + k) || arr[i][y] == (char)('0' + k))
                    {
                        return false;
                    }
                }
                break;
            case 9:
                for(int i = 0; i < m; i++){
                    if
                    (arr[x][i] == (char)('0' + k) || arr[i][y] == (char)('0' + k))
                    {
                        return false;
                    }

                }
                for(int i = (x / 3) * 3; i < (x / 3 + 1) * 3; i++){
                    for(int j = (y / 3) * 3; j < (y / 3 + 1) * 3; j++){
                        if(arr[i][j] == (char)('0' + k)){
                            return false;
                        }
                    }
                }
                break;
            case 4:
                for(int i = 0; i < m; i++){
                    if
                    (arr[x][i] == (char)('0' + k) || arr[i][y] == (char)('0' + k))
                    {
                        return false;
                    }

                }
                for(int i = (x / 2) * 2; i < (x / 2 + 1) * 2; i++){
                    for(int j = (y / 2) * 2; j < (y / 2 + 1) * 2; j++){
                        if(arr[i][j] == (char)('0' + k)){
                            return false;
                        }
                    }
                }
             break;
            case 6:
                for(int i = 0; i < m; i++){
                    if
                    (arr[x][i] == (char)('0' + k) || arr[i][y] == (char)('0' + k))
                    {
                        return false;
                    }

                }
                for(int i = (x / 2) * 2; i < (x / 2 + 1) * 2; i++){
                    for(int j = (y / 3) * 3; j < (y / 3 + 1) * 3; j++){
                        if(arr[i][j] == (char)('0' + k)){
                            return false;
                        }
                    }
                }
                break;
            case 8:
                for(int i = 0; i < m; i++){
                    if
                    (arr[x][i] == (char)('0' + k) || arr[i][y] == (char)('0' + k))
                    {
                        return false;
                    }

                }
                for(int i = (x / 4) * 4; i < (x / 4 + 1) * 4; i++){
                    for(int j = (y / 2) * 2; j < (y / 2 + 1) * 2; j++){
                        if(arr[i][j] == (char)('0' + k)){
                            return false;
                        }
                    }
                }
                break;
            default:

                break;
        }

        return true;
    }

    private static void print(char[][] arr) {
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
    }
   }
