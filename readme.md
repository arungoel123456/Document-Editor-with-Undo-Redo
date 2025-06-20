👉 Problem:
You need to design and implement a simple text document editor. The editor should support the following operations:

Type → Appends text at the end of the document.

Delete → Deletes a specified number of characters from the end of the document.

Undo → Reverses the last operation (either type or delete).

Redo → Reapplies the last undone operation.

👉 Requirements:
✅ The editor must support multiple levels of undo and redo (i.e., not just one step).
✅ Undo/redo should work correctly no matter how many operations the user performs.
✅ After any new operation (type/delete), redo history should be cleared.
✅ Your solution should be clean, maintainable, and easy to extend if we want to add more operations (e.g., replace text) in future.