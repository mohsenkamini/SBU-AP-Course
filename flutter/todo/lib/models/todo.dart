import 'package:ap1401_flutter_tutorial/models/todo_type.dart';

class Todo {
  Todo({
    required this.id,
    required this.title,
    required this.description,
    this.createdAt,
    this.type,
  });
  int id;
  String title;
  String description;
  DateTime? createdAt;
  TodoType? type;
}
