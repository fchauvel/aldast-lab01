package no.ntnu.idata2302.lab01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


import no.ntnu.idata2302.lab01.RSP;
import static no.ntnu.idata2302.lab01.RSP.ROCK;
import static no.ntnu.idata2302.lab01.RSP.SCISSOR;
import static no.ntnu.idata2302.lab01.RSP.PAPER;


public class RSPTest
{

    @Test
    public void drawWhenSameChoice()
    {
        short player1 = ROCK;
        short player2 = ROCK;

        short result = RSP.whoWins(player1, player2);

        assertEquals(0, result);
    }

    @Test
    public void rockDefeatsScissor()
    {
        short player1 = ROCK;
        short player2 = SCISSOR;

        short result = RSP.whoWins(player1, player2);

        assertEquals(1, result);
    }

    @Test
    public void rockLoosesToPaper()
    {
        short player1 = ROCK;
        short player2 = PAPER;

        short result = RSP.whoWins(player1, player2);

        assertEquals(2, result);
    }

    @Test
    public void scissorDefeatsPaper()
    {
        short player1 = SCISSOR;
        short player2 = PAPER;

        short result = RSP.whoWins(player1, player2);

        assertEquals(1, result);
    }

    @Test
    public void scissorLoosesRock()
    {
        short player1 = SCISSOR;
        short player2 = ROCK;

        short result = RSP.whoWins(player1, player2);

        assertEquals(2, result);
    }

    @Test
    public void paperDefeatsRock()
    {
        short player1 = PAPER;
        short player2 = ROCK;

        short result = RSP.whoWins(player1, player2);

        assertEquals(1, result);
    }

    @Test
    public void paperLoosesToScissor()
    {
        short player1 = PAPER;
        short player2 = SCISSOR;

        short result = RSP.whoWins(player1, player2);

        assertEquals(2, result);
    }


    @Test
    public void rejectInvalidChoiceForPlayer1()
    {
        short player1 = 12;
        short player2 = ROCK;

        try {
            short result = RSP.whoWins(player1, player2);
            fail("Should raise when Player1's choice is invalid.");

        } catch (Exception e) {

        }
    }

    @Test
    public void rejectInvalidChoiceForPlayer2()
    {
        short player1 = SCISSOR;
        short player2 = 12;

        try {
            short result = RSP.whoWins(player1, player2);
            fail("Should raise when Player2's choice is invalid.");

        } catch (Exception e) {

        }
    }


}
