package typings.zxcvbn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZXCVBNSequence extends js.Object {
  
  /**
    * if sequence is ascending.
    */
  var ascending: Boolean = js.native
  
  /**
    * the base number of guesses.
    */
  var base_guesses: Double = js.native
  
  /**
    * the base match to relate to.
    */
  var base_matches: String = js.native
  
  /**
    * the base token to relate to.
    */
  var base_token: String = js.native
  
  /**
    * the dictionary this sequence was found in.
    */
  var dictionary_name: String = js.native
  
  /**
    * estimated guesses needed to crack sequence.
    */
  var guesses: Double = js.native
  
  /**
    * order of magnitude of guesses.
    */
  var guesses_log10: Double = js.native
  
  /**
    * sequence index.
    */
  var i: Double = js.native
  
  /**
    * sequence section number.
    */
  var j: Double = js.native
  
  /**
    * is part of l33t speak.
    */
  var l33t: Boolean = js.native
  
  /**
    * how many variations of l33t speak.
    */
  var l33t_variations: Double = js.native
  
  /**
    * the word that was matched in dictionary.
    */
  var matched_word: String = js.native
  
  /**
    * what type of pattern the sequence contains.
    */
  var pattern: String = js.native
  
  /**
    * the rank of the sequence in the dictionary.
    */
  var rank: Double = js.native
  
  /**
    * how many times the sequence is repeated.
    */
  var repeat_count: Double = js.native
  
  /**
    * is reveresed.
    */
  var reversed: Boolean = js.native
  
  /**
    * what type of sequence it is.
    */
  var sequence_name: String = js.native
  
  /**
    * how much space the sequence has left.
    */
  var sequence_space: Double = js.native
  
  /**
    * the token the sequence is based off.
    */
  var token: String = js.native
  
  /**
    * uppercase variations of the token.
    */
  var uppercase_variations: Double = js.native
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
  
  @scala.inline
  implicit class ZXCVBNSequenceOps[Self <: ZXCVBNSequence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAscending(value: Boolean): Self = this.set("ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase_guesses(value: Double): Self = this.set("base_guesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase_matches(value: String): Self = this.set("base_matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase_token(value: String): Self = this.set("base_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionary_name(value: String): Self = this.set("dictionary_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuesses(value: Double): Self = this.set("guesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuesses_log10(value: Double): Self = this.set("guesses_log10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI(value: Double): Self = this.set("i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJ(value: Double): Self = this.set("j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL33t(value: Boolean): Self = this.set("l33t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL33t_variations(value: Double): Self = this.set("l33t_variations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatched_word(value: String): Self = this.set("matched_word", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeat_count(value: Double): Self = this.set("repeat_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequence_name(value: String): Self = this.set("sequence_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequence_space(value: Double): Self = this.set("sequence_space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUppercase_variations(value: Double): Self = this.set("uppercase_variations", value.asInstanceOf[js.Any])
  }
}
