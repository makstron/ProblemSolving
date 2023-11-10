package com.klim.minimum_sum_10;

import com.klim.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSum10Tests {

    class Set {
        List<Integer> list;
        Integer attempts;
        Integer expected;

        public Set(Integer[] list, Integer attempts, Integer expected) {
            this.list = Arrays.asList(list);
            this.attempts = attempts;
            this.expected = expected;
        }
    }


    public void runAllFor(Solve solve) {
        ArrayList<Set> sets = new ArrayList<>();

        sets.add(new Set(new Integer[]{2}, 1, 1));
        sets.add(new Set(new Integer[]{2, 3}, 1, 4));
        sets.add(new Set(new Integer[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 500, 100));
        sets.add(new Set(new Integer[]{394, 411, 93, 356, 168, 497, 335, 130, 481, 498, 92, 315, 162, 168, 489, 172, 21, 291, 309, 216, 50, 481, 190, 437, 493, 358, 248, 101, 321, 441, 379, 214, 203, 323, 422, 370, 171, 108, 351, 151, 106, 294, 465, 119, 461, 454, 290, 333, 96, 450, 48, 145, 431, 238, 433, 275, 447, 181, 227, 267, 473, 105, 333, 175, 279, 106, 396, 450, 213, 98, 100, 318, 391, 417, 288, 352, 222, 77, 184, 317, 27, 84, 462, 309, 173, 394, 83, 119, 426, 309, 238, 398, 266, 70, 424, 396, 27, 319, 345, 239, 416, 297, 409, 159, 65, 196, 10, 286, 125, 45, 102, 3, 480, 415, 163, 152, 161, 97, 271, 86, 257, 8, 484, 374, 429, 259, 270, 455, 78, 114, 45, 345, 262, 305, 3, 326, 353, 364, 111, 329, 261, 65, 183, 240, 331, 345, 244, 491, 293, 14, 429, 49, 373, 264, 423, 301, 22, 192, 107, 451, 157, 3, 148, 419, 308, 2, 96, 12, 366, 207, 340, 478, 123, 22, 69, 453, 218, 312, 444, 10, 325, 224, 410, 197, 487, 332, 349, 8, 375, 455, 311, 384, 310, 458, 154, 117, 459, 249, 480, 176, 307, 171, 153, 429, 192, 222, 382, 261, 33, 177, 122, 210, 400, 31, 406, 386, 215, 107, 245, 441, 413, 55, 324, 222, 12, 477, 190, 471, 78, 169, 146, 384, 339, 151, 313, 382, 372, 46, 494, 256, 222, 115, 465, 473, 146, 223, 210, 212, 329, 454, 152, 241, 361, 476, 315, 224, 304, 4, 194, 381, 25, 192, 117, 363, 194, 429, 97, 65, 474, 90, 172, 47, 205, 137, 19, 202, 359, 228, 413, 39, 33, 64, 131, 393, 391, 445, 117, 47, 301, 162, 279, 325, 205, 395, 39, 398, 175, 135, 314, 148, 225, 486, 46, 281, 122, 64, 482, 332, 291, 394, 370, 324, 309, 500, 68, 52, 297, 184, 98, 97, 346, 376, 273, 50, 123, 311, 300, 297, 446, 113, 297, 22, 98, 342, 154, 71, 406, 135, 402, 48, 380, 271, 223, 40, 123, 291, 91, 419, 474, 188, 367, 171, 416, 139, 73, 38, 301, 224, 334, 246, 336, 482, 119, 286, 324, 272, 356, 81, 258, 258, 128, 489, 380, 351, 29, 2, 493, 119, 272, 318, 159, 490, 341, 74, 480, 413, 463, 281, 136, 148, 26, 323, 130, 497, 108, 453, 120, 464, 33, 378, 73, 12, 218, 452, 214, 246, 306, 206, 217, 429, 376, 375, 419, 216, 300, 398, 480, 262, 30, 467, 261, 56, 289, 390, 404, 397, 342, 23, 212, 226, 252, 136, 238, 322, 439, 303, 67, 96, 9, 135, 25, 384, 361, 295, 451, 160, 44, 430, 273, 74, 396, 34, 481, 184, 275, 236, 432, 469, 110, 495, 194, 214, 130, 283, 35, 421, 86, 101, 16, 446, 88, 392, 181, 448, 38, 131, 108, 82, 60, 232, 7, 307, 265, 339, 342, 392, 74, 274, 360, 35, 120, 53, 248, 102, 188, 282, 22, 273, 235, 37, 218, 322, 281, 398, 269, 318, 28, 376, 251, 439, 460, 109, 245, 76, 447, 86, 467, 372, 211, 326, 259, 183, 231, 6, 284, 418, 288, 157, 190, 22, 45, 259, 343, 325, 8, 463, 143, 387, 191, 245, 325, 150, 354, 421, 225, 152, 358, 44, 376, 421, 369, 134, 103, 99, 139, 238, 368, 426, 394, 57, 299, 438, 167, 493, 263, 174, 456, 257, 60, 146, 1, 236, 147, 354, 8, 371, 6, 218, 414, 381, 138, 135, 366, 240, 85, 4, 329, 453, 282, 222, 9, 80, 159, 28, 73, 421, 201, 380, 29, 113, 377, 30, 200, 23, 235, 208, 393, 92, 277, 159, 472, 414, 293, 189, 5, 377, 193, 333, 329, 474, 54, 190, 405, 64, 69, 329, 485, 121, 208, 365, 85, 84, 394, 285, 106, 129, 344, 351, 220, 120, 361, 44, 33, 153, 232, 389, 381, 276, 221, 62, 249, 126, 103, 154, 189, 171, 334, 25, 143, 42, 390, 228, 477, 135, 12, 83, 263, 207, 285, 335, 326, 145, 230, 210, 149, 461, 98, 381, 237, 170, 442, 337, 147, 396, 342, 335, 418, 176, 212, 61, 69, 101, 288, 45, 235, 151, 479, 350, 357, 263, 184, 34, 407, 413, 243, 407, 225, 192, 288, 313, 213, 81, 2, 359, 477, 343, 45, 246, 370, 256, 306, 290, 208, 445, 335, 295, 95, 165, 144, 303, 428, 179, 336, 186, 443, 430, 93, 167, 473, 232, 332, 37, 312, 333, 247, 140, 27, 292, 386, 397, 399, 43, 38, 459, 488, 372, 253, 434, 37, 396, 89, 316, 74, 276, 353, 368, 58, 445, 34, 30, 176, 365, 419, 340, 197, 165, 479, 224, 308, 364, 472, 59, 407, 9, 17, 246, 233, 269, 179, 121, 164, 267, 288, 89, 395, 140, 456, 452, 437, 341, 333, 464, 58, 251, 303, 254, 268, 282, 329, 75, 497, 152, 133, 255, 13, 149, 500, 97, 417, 31, 69, 432, 149, 356, 372, 43, 495, 179, 494, 431, 20, 327, 395, 77, 429, 197, 182, 196, 330, 363, 271, 327, 366, 255, 81, 378, 404, 433, 326, 172, 463, 394, 104, 111, 249, 327, 154, 244, 6, 499, 26, 377, 325, 420, 305, 106, 469, 338, 301, 150, 200, 71, 476, 66, 326, 409, 295, 81, 193, 121, 252, 155, 366, 207, 117, 115, 34, 270, 210, 391, 121, 235, 267, 297, 7, 423, 402, 327, 260, 203, 476, 312, 125, 304, 377, 450, 64, 23, 382, 256, 495, 134, 262, 361, 192, 378, 327, 77, 500, 36, 467, 120, 122, 85, 416, 480, 7, 318, 306, 119, 20, 134, 430, 496, 437, 158, 298, 352, 180, 179, 107, 27, 164, 220, 387, 356, 97, 213, 432, 96, 100, 251, 67, 221, 187, 483, 201, 194, 152, 358, 164, 23, 491, 93, 18, 279, 250, 315, 130, 281, 494, 88, 307, 9, 307, 193, 216, 404, 257, 500, 351, 356, 250, 418, 429, 436, 252, 481, 481, 403, 338, 496, 425, 181, 88, 442, 311, 189, 109, 441}, 565, 149373));

        System.out.print(Color.WHITE_BOLD);
        System.out.println();
        System.out.println(solve.getName());
        System.out.print(Color.RESET);

        for (int i = 0; i < sets.size(); i++) {
            Set set = sets.get(i);

            long startTime = System.nanoTime();
            int result = solve.run(set.list, set.attempts);

            if (result == set.expected) {
                System.out.print(Color.GREEN_BOLD);
            } else {
                System.out.print(Color.RED_BOLD);
            }
            System.out.print("Test "+i+" - ");
            System.out.print(Color.RESET);

            System.out.println(result == set.expected);

            System.out.println("Duration: " + (System.nanoTime() - startTime));
            System.out.println("Expected: " + set.expected);
            System.out.println("Actual: " + result);
            System.out.println("-----------------------------------------");
        }

    }

}
