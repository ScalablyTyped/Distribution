package typings
package zxcvbnLib.zxcvbnMod.zxcvbnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZXCVBNSequence extends js.Object {
  /**
    * if sequence is ascending.
    */
  var ascending: scala.Boolean
  /**
    * the base number of guesses.
    */
  var base_guesses: scala.Double
  /**
    * the base match to relate to.
    */
  var base_matches: java.lang.String
  /**
    * the base token to relate to.
    */
  var base_token: java.lang.String
  /**
    * the dictionary this sequence was found in.
    */
  var dictionary_name: java.lang.String
  /**
    * estimated guesses needed to crack sequence.
    */
  var guesses: scala.Double
  /**
    * order of magnitude of guesses.
    */
  var guesses_log10: scala.Double
  /**
    * sequence index.
    */
  var i: scala.Double
  /**
    * sequence section number.
    */
  var j: scala.Double
  /**
    * is part of l33t speak.
    */
  var l33t: scala.Boolean
  /**
    * how many variations of l33t speak.
    */
  var l33t_variations: scala.Double
  /**
    * the word that was matched in dictionary.
    */
  var matched_word: java.lang.String
  /**
    * what type of pattern the sequence contains.
    */
  var pattern: java.lang.String
  /**
    * the rank of the sequence in the dictionary.
    */
  var rank: scala.Double
  /**
    * how many times the sequence is repeated.
    */
  var repeat_count: scala.Double
  /**
    * is reveresed.
    */
  var reversed: scala.Boolean
  /**
    * what type of sequence it is.
    */
  var sequence_name: java.lang.String
  /**
    * how much space the sequence has left.
    */
  var sequence_space: scala.Double
  /**
    * the token the sequence is based off.
    */
  var token: java.lang.String
  /**
    * uppercase variations of the token.
    */
  var uppercase_variations: scala.Double
}

object ZXCVBNSequence {
  @scala.inline
  def apply(
    ascending: scala.Boolean,
    base_guesses: scala.Double,
    base_matches: java.lang.String,
    base_token: java.lang.String,
    dictionary_name: java.lang.String,
    guesses: scala.Double,
    guesses_log10: scala.Double,
    i: scala.Double,
    j: scala.Double,
    l33t: scala.Boolean,
    l33t_variations: scala.Double,
    matched_word: java.lang.String,
    pattern: java.lang.String,
    rank: scala.Double,
    repeat_count: scala.Double,
    reversed: scala.Boolean,
    sequence_name: java.lang.String,
    sequence_space: scala.Double,
    token: java.lang.String,
    uppercase_variations: scala.Double
  ): ZXCVBNSequence = {
    val __obj = js.Dynamic.literal(ascending = ascending, base_guesses = base_guesses, base_matches = base_matches, base_token = base_token, dictionary_name = dictionary_name, guesses = guesses, guesses_log10 = guesses_log10, i = i, j = j, l33t = l33t, l33t_variations = l33t_variations, matched_word = matched_word, pattern = pattern, rank = rank, repeat_count = repeat_count, reversed = reversed, sequence_name = sequence_name, sequence_space = sequence_space, token = token, uppercase_variations = uppercase_variations)
  
    __obj.asInstanceOf[ZXCVBNSequence]
  }
}

