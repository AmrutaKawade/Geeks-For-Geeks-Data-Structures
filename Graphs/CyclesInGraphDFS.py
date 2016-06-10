#Print all cycles in Graph
def Cycles(node,visited,start):
	for node in graphMap[node]:
	    if node not in visited:
		visited.append(node)
		Cycles(node,visited,start)
	    elif start == node:
		print visited

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

for key in graphMap.keys():
    visited = []
    visited.append(key)
    Cycles(key,visited,key)

