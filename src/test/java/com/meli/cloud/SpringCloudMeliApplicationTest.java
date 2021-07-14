package com.meli.cloud;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.meli.cloud.service.MutantService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudMeliApplicationTest {

	@Autowired
	private MutantService mutantService;
	
//	@Test
//	void testWhenTheDnaIsCorrect() {
//		String[] adn = { "ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG" };
//		assertEquals(mutantService.validateDNA(adn), true);
//	}
//
//	@Test
//	void testWhenTheDnaHaveOneCharDiferentTheFirstLine() {
//		String[] adn = { "ATGXXA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG" };
//		assertEquals(mutantService.validateDNA(adn), false);
//	}
//
//	@Test
//	void testWhenTheDnaHaveOneCharDiferentTheThirdLine() {
//		String[] adn = { "ATGCGA", "CAGTGC", "T5ATGT", "AGAAGG", "CCCCTA", "TCACTG" };
//		assertEquals(mutantService.validateDNA(adn), false);
//	}
//
//	@Test
//	void testWhenTheDnaHaveNotTheLikeSizeInTheSecondLine() {
//		String[] adn = { "ATGCGA", "CAGT", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG" };
//		assertEquals(mutantService.validateDNA(adn), false);
//	}
//
//	@Test
//	void testWhenTheDnaIsMutant() {
//		String[] adn = { "ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG" };
//		assertEquals(mutantService.isMutant(adn), true);
//	}
//
//	@Test
//	void testWhenTheDnaIsNotMutant() {
//		String[] adn = { "ATGCGA", "CAGTGC", "TTATTT", "AGACGG", "GCGTCA", "TCACTG" };
//		assertEquals(mutantService.isMutant(adn), false);
//	}
//
//	@Test
//	void testWhenNumberMutationsIsThree() {
//		String[] adn = { "ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG" };
//		assertEquals(mutantService.getMutations(adn), 3);
//	}
//
//	@Test
//	void testWhenNumberMutationsIsTwo() {
//		String[] adn = { "ATGCGA", "CGAGTGC", "TTATGT", "AGAATG", "CCCCTA", "TCACTG" };
//		assertEquals(mutantService.getMutations(adn), 2);
//	}
//
//	@Test
//	void testWhenNumberMutationsIsOne() {
//		String[] adn = { "ATGCGA", "CGGTGC", "TTATGT", "AGAATC", "CCCCTA", "TCACAG" };
//		assertEquals(mutantService.getMutations(adn), 1);
//	}
//
//	@Test
//	void testWhenNumberMutationsIsZero() {
//		String[] adn = { "ATGCGA", "CAGTGC", "TTATTT", "AGACGG", "GCGTCA", "TCACTG" };
//		assertEquals(mutantService.getMutations(adn), 0);
//	}
}
