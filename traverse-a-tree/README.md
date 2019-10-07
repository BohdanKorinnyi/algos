### Traverse a Tree - Introduction
```
Pre-order Traversal
In-order Traversal
Post-order Traversal
Recursive or Iterative
```

**Pre-order traversal** is to visit the root first. Then traverse the left subtree. Finally, traverse the right subtree.

**In-order traversal** is to traverse the left subtree first. Then visit the root. Finally, traverse the right subtree.

Typically, for binary search tree, we can retrieve all the data in sorted order using in-order traversal. We will mention that again in another card(*Introduction to Data Structure - Binary Search Tree*).

**Post-order traversal** is to traverse the left subtree first. Then traverse the right subtree. Finally, visit the root.
It is worth noting that when you delete nodes in a tree, deletion process will be in post-order. That is to say, when you delete a node, you will delete its left child and its right child before you delete the node itself.
Also, post-order is widely use in mathematical expression. It is easier to write a program to parse a post-order expression. Here is an example:

![](mathematical_expression.png)