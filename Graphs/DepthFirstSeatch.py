def DFS(node,visited):
	print node
	for i in graphMap[node]:
	    if i not in visited:
		visited.append(i)
		DFS(i,visited)
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
visited = []
start = eval(raw_input())
visited.append(start)
DFS(start,visited)

