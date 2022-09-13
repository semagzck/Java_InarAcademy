(a)
int sum = 0; 
for (int i = 0; i < 4; i++) {
  if (i % 3 == 0) continue;
  sum += i;
}

(b)
int i = 0, sum = 0; 
while (i < 4) {
  if (i % 3 == 0) continue;
  sum += i;
  i++;
}
