package com.pragmatists;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DiamondShould {

    @Test
    void format_first_line_for_A() {
        String result = Diamond.print('A');

        assertThat(result).isEqualTo("A");
    }

    @Test
    void format_first_line_for_B() {
        String result = Diamond.print('B');
        assertThat(result).isEqualTo("-A-");
    }

    @Test
    void format_first_line_for_C() {
        String result = Diamond.print('C');
        assertThat(result).isEqualTo("--A--");
    }

    @Test
    void format_first_line_for_D() {
        String result = Diamond.print('D');
        assertThat(result).isEqualTo("---A---");
    }
}
