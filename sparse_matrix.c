#include<stdio.h>

int main(){
    int a[3][3], i, j, nz = 0, z = 0;

    // Input the elements of the matrix
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            printf("Enter the element for a[%d][%d]: ", i, j);
            scanf("%d", &a[i][j]);
        }
    }

    // Display the matrix
    printf("The matrix is:\n");
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            printf("%d\t", a[i][j]);
        }
        printf("\n");
    }

    // Check if it's a sparse matrix
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            if (a[i][j] == 0) {
                z++;  // Count zeros
            } else {
                nz++; // Count non-zeros
            }
        }
    }

    if (nz > z) {
        printf("Not a Sparse Matrix!!!\n");
    } else {
        // Creating the sparse matrix representation
        int s[nz][3], k = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (a[i][j] != 0) {
                    s[k][0] = i;       // Row index
                    s[k][1] = j;       // Column index
                    s[k][2] = a[i][j]; // Non-zero value
                    k++;
                }
            }
        }

        // Display the sparse matrix
        printf("\nSparse Matrix Representation (Row, Column, Value):\n");
        for (i = 0; i < nz; i++) {
            printf("%d\t%d\t%d\n", s[i][0], s[i][1], s[i][2]);
        }
    }

    return 0;
}
