import re

def sum_str(a,b):
  return a+b

def regex_str(a):
  res = re.search(r'abc', a)
  if res == None:
    return res
  else:
    return "found"

def test_sum_str():
  assert(sum_str("abc","def")) == "abcdef"

def test_regex_str():
  assert(regex_str("abg")) == None

def test_regex_str_2():
    assert(regex_str("abg abc")) == "found"
