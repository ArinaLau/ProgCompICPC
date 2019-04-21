import java.util.Scanner;

//acmicpc2016 - F

public class ConnectivityPotential {
    public static void main(String[] args) {
        int test_case, stations, con[][], con_potential, count=1;
        String connections;


        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in).useDelimiter("[,\\s+]");

        System.out.print("Enter number of test cases: ");
        test_case = scanner.nextInt();
        System.out.print("\n");

        do{
            System.out.println("Enter number of stations : ");
            stations = scanner.nextInt();

           con = new int[stations][stations];

            if(stations>0){
                for(int i=0; i<stations; i++) {
                    System.out.println("Enter connection between stations (1 or 0) : ");
                    connections = scanner.next();
                    for(int j=0; j<stations; j++){
                        if(connections.charAt(j)=='1')
                            con[i][j]=1;
                        else
                            con[i][j]=0;
                     }



 /*                   //F1
                    int len = con.length;
                    for(int k=0; k<len; k++){
                        for(int l=0; l<len; l++){
                            for(int m=0; m<len; m++){
                                if (con[l][k] !=0 & con[k][m]!=0 & l!=m){
                                    if(con[l][m] == 0){
                                        con[l][m] = con[l][k] + con[k][m];
                                    }
                                    else if(con[l][m]>1){
                                        if (con[l][k] + con[k][m] < con[l][m]){
                                            con[l][m] = con[l][k] + con[k][m];
                                        }
                                    }
                                }

                            }
                        }

                    }

                    //F2
                    int mh=0, hc=0;
                    for (i=0; i<len; i++) {
                        for (int j = 0; j < len; j++) {
                            if (con[i][j] > mh) {
                                mh = con[i][j];
                                hc = 1;
                            } else if (con[i][j] == mh)
                                hc++;
                        }
                    }*/
                   // con_potential = mh * hc;
                    }
                    mFl(con);
                    con_potential =CPot (con);
                    System.out.println("Case #" + count + ": " + con_potential);
                    count++;
                }
            test_case--;
        }while(test_case>0);
    }

    private static void mFl(int[][] am) {
        int nv=am.length;
        for (int ib=0; ib<nv; ib++)
            for (int sc=0; sc<nv; sc++)
                for (int tg=0; tg<nv; tg++)
                    if (am[sc][ib]!=0 & am[ib][tg]!=0 & sc!=tg)
                        if (am[sc][tg]==0) am[sc][tg]=am[sc][ib]+am[ib][tg];
                        else if (am[sc][tg]>1)
                            if (am[sc][ib]+am[ib][tg]<am[sc][tg]) am[sc][tg]=am[sc][ib]+am[ib][tg]; }

    private static int CPot (int[][] nw) {
        int mh=0;
        int hc=0;
        int vn=nw.length;
        for (int i=0; i<vn; i++)
            for (int j=0; j<vn; j++)
                if (nw[i][j]>mh) { mh=nw[i][j]; hc=1; }
                else if (nw[i][j]==mh) hc++;
        return (mh*hc);
    }
}


