import 'dart:io';


bool checkArray (List list) {
  return true;
}

main () {
  
  int n = int.parse(stdin.readLineSync()!);
  List list=List.empty();

  for (int i=1 ; i < n ; i++)
  {
    String? tempInput=stdin.readLineSync();
    List tempParams = layouts!.split(' ');
    list.add(tempInput);
  }
  print(list);
}