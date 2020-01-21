package typings.zxcvbn.mod

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
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], base_guesses = base_guesses.asInstanceOf[js.Any], base_matches = base_matches.asInstanceOf[js.Any], base_token = base_token.asInstanceOf[js.Any], dictionary_name = dictionary_name.asInstanceOf[js.Any], guesses = guesses.asInstanceOf[js.Any], guesses_log10 = guesses_log10.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any], l33t = l33t.asInstanceOf[js.Any], l33t_variations = l33t_variations.asInstanceOf[js.Any], matched_word = matched_word.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], repeat_count = repeat_count.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], sequence_name = sequence_name.asInstanceOf[js.Any], sequence_space = sequence_space.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], uppercase_variations = uppercase_variations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZXCVBNSequence]
  }
}

