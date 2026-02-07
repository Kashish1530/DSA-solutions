1from typing import List
2class Solution:
3    def generateParenthesis(self, n: int) -> List[str]:
4        result = []
5        def backtrack(curr: str, open_count: int, close_count: int):
6                if len(curr) == 2 * n:
7                    result.append(curr)
8                    return
9
10                if open_count < n:
11                    backtrack(curr + "(", open_count + 1, close_count)
12
13                if close_count < open_count:
14                    backtrack(curr + ")", open_count, close_count + 1)
15
16        backtrack("", 0, 0)
17        return result   