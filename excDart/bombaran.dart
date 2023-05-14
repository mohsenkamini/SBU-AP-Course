import 'dart:io';

bool checkRowOrColumn (List array) {    // check if there's a zero before a one like 1 1 1 0
  bool zeroFlag=false;
  for (int i=array.length-1 ; i >=0 ; i--)
  {
    if (array[i] == '0')
        zeroFlag=true;    
    else if (zeroFlag ) // it means that we have received a zero before one
        return false;
  }
  return true;
}

bool checkOneCell (int i, int j, List rows, List columns) {
  if (i == rows.length-1 || j == columns.length-1 )
    return true;
  if (checkRowOrColumn(columns[j]))
    return true;
  if (checkRowOrColumn(rows[i]))
    return true;
  if (rows[i][j+1] == '1')
    if (checkOneCell(i, j+1, rows, columns))
      return true;
  if (rows[i+1][j] == '1')
    if (checkOneCell(i+1, j, rows, columns))
      return true;

  return false;
}

main () {
  
  int n = int.parse(stdin.readLineSync()!);
  List rows=List.empty(growable: true);
  List columns=List.empty(growable: true);

  for (int i=0 ; i < n ; i++)
  {
    String? tempInput=stdin.readLineSync();
    List tempParams = tempInput!.split(' ');
    rows.add(tempParams);
  }
  
  for (int j=0 ; j < n ; j++)  
  {
    String temp="";
    for (int i=0 ; i < n ; i++)
    {
      if (rows[i][j] != null)
        temp += (rows[i][j]!);
    }
    columns.add(temp.split(''));
  }
  // print(columns[3]);
  // print(rows[3]);
  // print(checkRowOrColumn(rows[3]));
  for (int i=0 ; i < n ; i++)
    for (int j=0 ; j < n ; j++)  
      if (rows[i][j] == '1')
        if (!checkOneCell(i, j, rows, columns))
          {
            print('NO');
            return 1;
          }
  print('YES');
}
