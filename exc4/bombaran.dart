import 'dart:io';


bool checkArray (List list) {
  return true;
}

main () {
  
  int n = int.parse(stdin.readLineSync()!);
  List list=List.empty(growable: true);

  for (int i=0 ; i < n ; i++)
  {
    String? tempInput=stdin.readLineSync();
    List tempParams = tempInput!.split(' ');
    list.add(tempInput);
  }
  print(list);
}