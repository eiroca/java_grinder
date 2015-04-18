#include <stdio.h>
#include <stdlib.h>

void init();
int add_nums_II(int a, int b);
int sub_nums_II(int a, int b);
int mul_nums_II(int a, int b);
int div_nums_II(int a, int b);
int mod_nums_II(int a, int b);
int shift_nums_II(int a, int b);
int loop_test_II(int a, int b);
void put_static_I(int a);
int get_static();
int method_call_test_II(int a, int b);
int method_call_long_test_I(int a);
int add_array_aB(char *a);

struct _byte_array
{
  int len;
  char data[];
};

int main(int argc, char *argv[])
{
  int a,b;
  struct _byte_array *array = alloca(4 + sizeof(int));

  if (argc != 3)
  {
    printf("Usage: %s <num> <num>\n", argv[0]);
    exit(0);
  }

  array->len = 4;
  array->data[0] = 1;
  array->data[1] = 2;
  array->data[2] = 3;
  array->data[3] = 4;

  a = atoi(argv[1]);
  b = atoi(argv[2]);

  init();

  printf("%d + %d = %d\n", a, b, add_nums_II(a,b));
  printf("%d - %d = %d\n", a, b, sub_nums_II(a,b));
  printf("%d * %d = %d\n", a, b, mul_nums_II(a,b));
  printf("%d / %d = %d\n", a, b, div_nums_II(a,b));
  printf("%d %% %d = %d\n", a, b, mod_nums_II(a,b));
  printf("%d << %d = %d\n", a, b, shift_nums_II(a,b));
  printf("loop test (%d,%d)  %d\n", a, b, loop_test_II(a,b));
  printf("get_static()=%d\n", get_static());
  printf("put_static(%d)\n", a);
  put_static_I(a);
  printf("get_static()=%d\n", get_static());
  printf("method_call_test_II(%d,%d)=%d\n", a, b, method_call_test_II(a,b));
  printf("method_call_long_test_I(%d)=%d\n", a, method_call_long_test_I(a));
  printf("add_array_aB(%p)=%d\n", array, add_array_aB(array->data));

  return 0;
}

