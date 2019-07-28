package typings.zxcvbn.zxcvbnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZXCVBNSequence extends js.Object {
  /**
    * if sequence is ascending.
    */
  var ascending: Boolean
  /**
    * the base number of guesses.
    */
  var base_guesses: Double
  /**
    * the base match to relate to.
    */
  var base_matches: String
  /**
    * the base token to relate to.
    */
  var base_token: String
  /**
    * the dictionary this sequence was found in.
    */
  var dictionary_name: String
  /**
    * estimated guesses needed to crack sequence.
    */
  var guesses: Double
  /**
    * order of magnitude of guesses.
    */
  var guesses_log10: Double
  /**
    * sequence index.
    */
  var i: Double
  /**
    * sequence section number.
    */
  var j: Double
  /**
    * is part of l33t speak.
    */
  var l33t: Boolean
  /**
    * how many variations of l33t speak.
    */
  var l33t_variations: Double
  /**
    * the word that was matched in dictionary.
    */
  var matched_word: String
  /**
    * what type of pattern the sequence contains.
    */
  var pattern: String
  /**
    * the rank of the sequence in the dictionary.
    */
  var rank: Double
  /**
    * how many times the sequence is repeated.
    */
  var repeat_count: Double
  /**
    * is reveresed.
    */
  var reversed: Boolean
  /**
    * what type of sequence it is.
    */
  var sequence_name: String
  /**
    * how much space the sequence has left.
    */
  var sequence_space: Double
  /**
    * the token the sequence is based off.
    */
  var token: String
  /**
    * uppercase variations of the token.
    */
  var uppercase_variations: Double
}

object ZXCVBNSequence {
  @scala.inline
  def apply(
    ascending: Boolean,
    base_guesses: Double,
    base_matches: String,
    base_token: String,
    dictionary_name: String,
    guesses: Double,
    guesses_log10: Double,
    i: Double,
    j: Double,
    l33t: Boolean,
    l33t_variations: Double,
    matched_word: String,
    pattern: String,
    rank: Double,
    repeat_count: Double,
    reversed: Boolean,
    sequence_name: String,
    sequence_space: Double,
    token: String,
    uppercase_variations: Double
  ): ZXCVBNSequence = {
    val __obj = js.Dynamic.literal(ascending = ascending, base_guesses = base_guesses, base_matches = base_matches, base_token = base_token, dictionary_name = dictionary_name, guesses = guesses, guesses_log10 = guesses_log10, i = i, j = j, l33t = l33t, l33t_variations = l33t_variations, matched_word = matched_word, pattern = pattern, rank = rank, repeat_count = repeat_count, reversed = reversed, sequence_name = sequence_name, sequence_space = sequence_space, token = token, uppercase_variations = uppercase_variations)
  
    __obj.asInstanceOf[ZXCVBNSequence]
  }
}

