# doubly linked list node


class Node:
    def __init__(self, key, value) -> None:
        self.key = key
        self.value = value
        self.next = None
        self.prev = None


class LRUCache:

    def __init__(self, capacity: int):
        self.capacity = capacity
        self.head = Node(0, 0)
        self.tail = Node(0, 0)
        self.head.next = self.tail
        self.tail.prev = self.head
        self.hashmap = dict()

    def get(self, key: int) -> int:
        if(key not in self.hashmap):
            return -1
        else:
            value = self.hashmap[key].value
            # deleting the current node
            currNode = self.hashmap[key]
            prevNode = currNode.prev
            nextNode = currNode.next
            nextNode.prev = prevNode
            prevNode.next = nextNode
            # inserting node as next of head
            temp = self.head.next
            self.head.next = currNode
            currNode.prev = self.head
            currNode.next = temp
            temp.prev = currNode
            return value

    def put(self, key: int, value: int) -> None:
        if(self.capacity <= len(self.hashmap.items()) and key not in self.hashmap):
            # delete last node
            delNode = self.tail.prev
            nodeKey = delNode.key
            nodeValue = delNode.value
            self.hashmap.pop(nodeKey)
            prevNode = delNode.prev
            self.tail.prev = prevNode
            prevNode.next = self.tail

        if(key not in self.hashmap):
            newNode = Node(key, value)
        else:
            currNode = self.hashmap[key]
            prevNode = currNode.prev
            nextNode = currNode.next
            newNode = Node(key, value)
            # deleting the existing node
            nextNode.prev = prevNode
            prevNode.next = nextNode
        # inserting node as next of head
        temp = self.head.next
        self.head.next = newNode
        newNode.prev = self.head
        newNode.next = temp
        temp.prev = newNode
        self.hashmap[key] = newNode


lru = LRUCache(2)
lru.put(1, 1)
lru.put(2, 2)
print(lru.get(1))
lru.put(3, 3)
print(lru.get(2))
lru.put(4, 4)
print(lru.get(1))
print(lru.get(3))
print(lru.get(4))
