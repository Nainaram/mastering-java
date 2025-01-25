def max_thieves_caught(arr, k):
    # Lists to store positions of policemen and thieves
    policemen = []
    thieves = []
    
    # Traverse the array to collect positions of 'p' and 't'
    for i in range(len(arr)):
        if arr[i] == 'p':
            policemen.append(i)
        elif arr[i] == 't':
            thieves.append(i)
    
    caught_thieves = 0
    
    # Match policemen with thieves
    while policemen and thieves:
        police_pos = policemen[0]
        thief_pos = thieves[0]
        
        if abs(police_pos - thief_pos) <= k:
            # A thief can be caught by this policeman
            caught_thieves += 1
            # Remove matched policeman and thief
            policemen.pop(0)
            thieves.pop(0)
        elif police_pos < thief_pos:
            # This policeman cannot catch the current thief, try the next policeman
            policemen.pop(0)
        else:
            # This thief cannot be caught by the current policeman, try the next thief
            thieves.pop(0)
    
    return caught_thieves

# Example usage
arr = ['p', 't', 't', 'p', 't']
k = 1
print(max_thieves_caught(arr, k))  # Output: 2
ff