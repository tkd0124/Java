package Parity;

public class ParityCheck {
    public char calculateParityBit(String data, boolean evenParity){
        int countOnes = 0;
        for (int i = 0; i < data.length(); i++){
            if (data.charAt(i) == '1'){
                countOnes++;
            }
        }
        if(evenParity){
        //偶数パリティの場合
        //すでに1の数が偶数なら、パリティビットは'0'（変更しない）
        // 奇数なら、'1'を追加して偶数にする
            return (countOnes % 2 == 0) ? '0' : '1';
        }else {
        // 奇数パリティの場合
        // 1の数が偶数なら、パリティビットは'1'（偶数に1を足して奇数にする）
        // 1の数が奇数なら、'0'を追加して奇数のままにする
            return (countOnes % 2 == 0) ? '1' : '0';
        }
    }
}
