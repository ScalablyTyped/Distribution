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

