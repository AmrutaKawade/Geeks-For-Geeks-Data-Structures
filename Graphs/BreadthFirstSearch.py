#BFS
def BFS(start):
    visited = []
    queue = []
    queue.append(start)
    visited.append(start)
    while len(queue) != 0:
	print queue[0]
        nodeArr = graphMap[queue[0]]
        del queue[0]			
	for i in nodeArr:
	    if i not in visited:
		visited.append(i)
		queue.append(i)			


#Create Graph
graphMap = {}
nodes = int(raw_input())
count = 0
while count != nodes:
	fro,to = raw_input().split()
	try:
	    graphMap[eval(fro)].append(eval(to))
	except KeyError:
            graphMap[eval(fro)] = [eval(to)] 
	    count += 1
print "Start Node"
BFS(eval(raw_input()))
