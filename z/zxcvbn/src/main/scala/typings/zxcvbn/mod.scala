package typings.zxcvbn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(password: String): ZXCVBNResult = ^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any]).asInstanceOf[ZXCVBNResult]
  inline def apply(password: String, userInputs: js.Array[String]): ZXCVBNResult = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], userInputs.asInstanceOf[js.Any])).asInstanceOf[ZXCVBNResult]
  
  @JSImport("zxcvbn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ZXCVBNAttackTime extends StObject {
    
    /**
      * offline attack with user-unique salting but a fast hash
      * function like SHA-1, SHA-256 or MD5. A wide range of
      * reasonable numbers anywhere from one billion - one trillion
      * guesses per second, depending on number of cores and machines.
      * ballparking at 10B/sec.
      */
    var offline_fast_hashing_1e10_per_second: String | Double
    
    /**
      * offline attack. assumes multiple attackers,
      * proper user-unique salting, and a slow hash function
      * w/ moderate work factor, such as bcrypt, scrypt, PBKDF2.
      */
    var offline_slow_hashing_1e4_per_second: String | Double
    
    /**
      * online attack on a service that doesn't ratelimit,
      * or where an attacker has outsmarted ratelimiting.
      */
    var online_no_throttling_10_per_second: String | Double
    
    /**
      * online attack on a service that ratelimits password auth attempts.
      */
    var online_throttling_100_per_hour: String | Double
  }
  object ZXCVBNAttackTime {
    
    inline def apply(
      offline_fast_hashing_1e10_per_second: String | Double,
      offline_slow_hashing_1e4_per_second: String | Double,
      online_no_throttling_10_per_second: String | Double,
      online_throttling_100_per_hour: String | Double
    ): ZXCVBNAttackTime = {
      val __obj = js.Dynamic.literal(offline_fast_hashing_1e10_per_second = offline_fast_hashing_1e10_per_second.asInstanceOf[js.Any], offline_slow_hashing_1e4_per_second = offline_slow_hashing_1e4_per_second.asInstanceOf[js.Any], online_no_throttling_10_per_second = online_no_throttling_10_per_second.asInstanceOf[js.Any], online_throttling_100_per_hour = online_throttling_100_per_hour.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZXCVBNAttackTime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZXCVBNAttackTime] (val x: Self) extends AnyVal {
      
      inline def setOffline_fast_hashing_1e10_per_second(value: String | Double): Self = StObject.set(x, "offline_fast_hashing_1e10_per_second", value.asInstanceOf[js.Any])
      
      inline def setOffline_slow_hashing_1e4_per_second(value: String | Double): Self = StObject.set(x, "offline_slow_hashing_1e4_per_second", value.asInstanceOf[js.Any])
      
      inline def setOnline_no_throttling_10_per_second(value: String | Double): Self = StObject.set(x, "online_no_throttling_10_per_second", value.asInstanceOf[js.Any])
      
      inline def setOnline_throttling_100_per_hour(value: String | Double): Self = StObject.set(x, "online_throttling_100_per_hour", value.asInstanceOf[js.Any])
    }
  }
  
  trait ZXCVBNFeedback extends StObject {
    
    /**
      * a possibly-empty list of suggestions to help choose a less
      * guessable password. eg. 'Add another word or two'
      */
    var suggestions: js.Array[String]
    
    /**
      * explains what's wrong, eg. 'this is a top-10 common password'.
      * not always set -- sometimes an empty string
      */
    var warning: ZXCVBNFeedbackWarning
  }
  object ZXCVBNFeedback {
    
    inline def apply(suggestions: js.Array[String], warning: ZXCVBNFeedbackWarning): ZXCVBNFeedback = {
      val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZXCVBNFeedback]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZXCVBNFeedback] (val x: Self) extends AnyVal {
      
      inline def setSuggestions(value: js.Array[String]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsVarargs(value: String*): Self = StObject.set(x, "suggestions", js.Array(value*))
      
      inline def setWarning(value: ZXCVBNFeedbackWarning): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  object ZXCVBNFeedbackWarning {
    
    inline def `A word by itself is easy to guess`: typings.zxcvbn.zxcvbnStrings.`A word by itself is easy to guess` = ("A word by itself is easy to guess").asInstanceOf[typings.zxcvbn.zxcvbnStrings.`A word by itself is easy to guess`]
    
    inline def `Common names and surnames are easy to guess`: typings.zxcvbn.zxcvbnStrings.`Common names and surnames are easy to guess` = ("Common names and surnames are easy to guess").asInstanceOf[typings.zxcvbn.zxcvbnStrings.`Common names and surnames are easy to guess`]
    
    inline def `Dates are often easy to guess`: typings.zxcvbn.zxcvbnStrings.`Dates are often easy to guess` = ("Dates are often easy to guess").asInstanceOf[typings.zxcvbn.zxcvbnStrings.`Dates are often easy to guess`]
    
    inline def `Names and surnames by themselves are easy to guess`: typings.zxcvbn.zxcvbnStrings.`Names and surnames by themselves are easy to guess` = ("Names and surnames by themselves are easy to guess").asInstanceOf[typings.zxcvbn.zxcvbnStrings.`Names and surnames by themselves are easy to guess`]
    
    inline def `Recent years are easy to guess`: typings.zxcvbn.zxcvbnStrings.`Recent years are easy to guess` = ("Recent years are easy to guess").asInstanceOf[typings.zxcvbn.zxcvbnStrings.`Recent years are easy to guess`]
    
    inline def `Repeats like QuotationmarkaaaQuotationmark are easy to guess`: typings.zxcvbn.zxcvbnStrings.`Repeats like QuotationmarkaaaQuotationmark are easy to guess` = ("Repeats like \"aaa\" are easy to guess").asInstanceOf[typings.zxcvbn.zxcvbnStrings.`Repeats like QuotationmarkaaaQuotationmark are easy to guess`]
    
    inline def `Repeats like QuotationmarkabcabcabcQuotationmark are only slightly harder to guess than QuotationmarkabcQuotationmark`: /* Repeats like "abcabcabc" are only slightly harder to guess than "abc" */ String = ("Repeats like \"abcabcabc\" are only slightly harder to guess than \"abc\"").asInstanceOf[/* Repeats like "abcabcabc" are only slightly harder to guess than "abc" */ String]
    
    inline def `Sequences like abc or 6543 are easy to guess`: typings.zxcvbn.zxcvbnStrings.`Sequences like abc or 6543 are easy to guess` = ("Sequences like abc or 6543 are easy to guess").asInstanceOf[typings.zxcvbn.zxcvbnStrings.`Sequences like abc or 6543 are easy to guess`]
    
    inline def `Short keyboard patterns are easy to guess`: typings.zxcvbn.zxcvbnStrings.`Short keyboard patterns are easy to guess` = ("Short keyboard patterns are easy to guess").asInstanceOf[typings.zxcvbn.zxcvbnStrings.`Short keyboard patterns are easy to guess`]
    
    inline def `Straight rows of keys are easy to guess`: typings.zxcvbn.zxcvbnStrings.`Straight rows of keys are easy to guess` = ("Straight rows of keys are easy to guess").asInstanceOf[typings.zxcvbn.zxcvbnStrings.`Straight rows of keys are easy to guess`]
    
    inline def `This is a top-10 common password`: typings.zxcvbn.zxcvbnStrings.`This is a top-10 common password` = ("This is a top-10 common password").asInstanceOf[typings.zxcvbn.zxcvbnStrings.`This is a top-10 common password`]
    
    inline def `This is a top-100 common password`: typings.zxcvbn.zxcvbnStrings.`This is a top-100 common password` = ("This is a top-100 common password").asInstanceOf[typings.zxcvbn.zxcvbnStrings.`This is a top-100 common password`]
    
    inline def `This is a very common password`: typings.zxcvbn.zxcvbnStrings.`This is a very common password` = ("This is a very common password").asInstanceOf[typings.zxcvbn.zxcvbnStrings.`This is a very common password`]
    
    inline def `This is similar to a commonly used password`: typings.zxcvbn.zxcvbnStrings.`This is similar to a commonly used password` = ("This is similar to a commonly used password").asInstanceOf[typings.zxcvbn.zxcvbnStrings.`This is similar to a commonly used password`]
    
    inline def `Use a longer keyboard pattern with more turns`: typings.zxcvbn.zxcvbnStrings.`Use a longer keyboard pattern with more turns` = ("Use a longer keyboard pattern with more turns").asInstanceOf[typings.zxcvbn.zxcvbnStrings.`Use a longer keyboard pattern with more turns`]
    
    inline def _empty: typings.zxcvbn.zxcvbnStrings._empty = "".asInstanceOf[typings.zxcvbn.zxcvbnStrings._empty]
  }
  /* Rewritten from type alias, can be one of: 
    - typings.zxcvbn.zxcvbnStrings.`Straight rows of keys are easy to guess`
    - typings.zxcvbn.zxcvbnStrings.`Short keyboard patterns are easy to guess`
    - typings.zxcvbn.zxcvbnStrings.`Use a longer keyboard pattern with more turns`
    - typings.zxcvbn.zxcvbnStrings.`Repeats like QuotationmarkaaaQuotationmark are easy to guess`
    - / * Repeats like "abcabcabc" are only slightly harder to guess than "abc" * / java.lang.String
    - typings.zxcvbn.zxcvbnStrings.`Sequences like abc or 6543 are easy to guess`
    - typings.zxcvbn.zxcvbnStrings.`Recent years are easy to guess`
    - typings.zxcvbn.zxcvbnStrings.`Dates are often easy to guess`
    - typings.zxcvbn.zxcvbnStrings.`This is a top-10 common password`
    - typings.zxcvbn.zxcvbnStrings.`This is a top-100 common password`
    - typings.zxcvbn.zxcvbnStrings.`This is a very common password`
    - typings.zxcvbn.zxcvbnStrings.`This is similar to a commonly used password`
    - typings.zxcvbn.zxcvbnStrings.`A word by itself is easy to guess`
    - typings.zxcvbn.zxcvbnStrings.`Names and surnames by themselves are easy to guess`
    - typings.zxcvbn.zxcvbnStrings.`Common names and surnames are easy to guess`
    - typings.zxcvbn.zxcvbnStrings._empty
  */
  type ZXCVBNFeedbackWarning = _ZXCVBNFeedbackWarning | (/* Repeats like "abcabcabc" are only slightly harder to guess than "abc" */ String)
  
  trait ZXCVBNResult extends StObject {
    
    /**
      * how long it took zxcvbn to calculate an answer,
      * in milliseconds.
      */
    var calc_time: Double
    
    /**
      * same keys as result.crack_times_seconds,
      * with friendlier display string values:
      * "less than a second", "3 hours", "centuries", etc.
      */
    var crack_times_display: ZXCVBNAttackTime
    
    /**
      * dictionary of back-of-the-envelope crack time
      * estimations, in seconds, based on a few scenarios.
      */
    var crack_times_seconds: ZXCVBNAttackTime
    
    /**
      * verbal feedback to help choose better passwords. set when score <= 2.
      */
    var feedback: ZXCVBNFeedback
    
    /**
      * estimated guesses needed to crack password
      */
    var guesses: Double
    
    /**
      * order of magnitude of result.guesses
      */
    var guesses_log10: Double
    
    /**
      * Integer from 0-4 (useful for implementing a strength bar):
      * 0 too guessable: risky password. (guesses < 10^3)
      * 1 very guessable: protection from throttled online attacks. (guesses < 10^6)
      * 2 somewhat guessable: protection from unthrottled online attacks. (guesses < 10^8)
      * 3 safely unguessable: moderate protection from offline slow-hash scenario. (guesses < 10^10)
      * 4 very unguessable: strong protection from offline slow-hash scenario. (guesses >= 10^10)
      */
    var score: ZXCVBNScore
    
    /**
      * the list of patterns that zxcvbn based the
      * guess calculation on.
      */
    var sequence: js.Array[ZXCVBNSequence]
  }
  object ZXCVBNResult {
    
    inline def apply(
      calc_time: Double,
      crack_times_display: ZXCVBNAttackTime,
      crack_times_seconds: ZXCVBNAttackTime,
      feedback: ZXCVBNFeedback,
      guesses: Double,
      guesses_log10: Double,
      score: ZXCVBNScore,
      sequence: js.Array[ZXCVBNSequence]
    ): ZXCVBNResult = {
      val __obj = js.Dynamic.literal(calc_time = calc_time.asInstanceOf[js.Any], crack_times_display = crack_times_display.asInstanceOf[js.Any], crack_times_seconds = crack_times_seconds.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], guesses = guesses.asInstanceOf[js.Any], guesses_log10 = guesses_log10.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZXCVBNResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZXCVBNResult] (val x: Self) extends AnyVal {
      
      inline def setCalc_time(value: Double): Self = StObject.set(x, "calc_time", value.asInstanceOf[js.Any])
      
      inline def setCrack_times_display(value: ZXCVBNAttackTime): Self = StObject.set(x, "crack_times_display", value.asInstanceOf[js.Any])
      
      inline def setCrack_times_seconds(value: ZXCVBNAttackTime): Self = StObject.set(x, "crack_times_seconds", value.asInstanceOf[js.Any])
      
      inline def setFeedback(value: ZXCVBNFeedback): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
      
      inline def setGuesses(value: Double): Self = StObject.set(x, "guesses", value.asInstanceOf[js.Any])
      
      inline def setGuesses_log10(value: Double): Self = StObject.set(x, "guesses_log10", value.asInstanceOf[js.Any])
      
      inline def setScore(value: ZXCVBNScore): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      inline def setSequence(value: js.Array[ZXCVBNSequence]): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSequenceVarargs(value: ZXCVBNSequence*): Self = StObject.set(x, "sequence", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.zxcvbn.zxcvbnInts.`0`
    - typings.zxcvbn.zxcvbnInts.`1`
    - typings.zxcvbn.zxcvbnInts.`2`
    - typings.zxcvbn.zxcvbnInts.`3`
    - typings.zxcvbn.zxcvbnInts.`4`
  */
  trait ZXCVBNScore extends StObject
  object ZXCVBNScore {
    
    inline def `0`: typings.zxcvbn.zxcvbnInts.`0` = 0.asInstanceOf[typings.zxcvbn.zxcvbnInts.`0`]
    
    inline def `1`: typings.zxcvbn.zxcvbnInts.`1` = 1.asInstanceOf[typings.zxcvbn.zxcvbnInts.`1`]
    
    inline def `2`: typings.zxcvbn.zxcvbnInts.`2` = 2.asInstanceOf[typings.zxcvbn.zxcvbnInts.`2`]
    
    inline def `3`: typings.zxcvbn.zxcvbnInts.`3` = 3.asInstanceOf[typings.zxcvbn.zxcvbnInts.`3`]
    
    inline def `4`: typings.zxcvbn.zxcvbnInts.`4` = 4.asInstanceOf[typings.zxcvbn.zxcvbnInts.`4`]
  }
  
  trait ZXCVBNSequence extends StObject {
    
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
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: ZXCVBNSequence] (val x: Self) extends AnyVal {
      
      inline def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
      
      inline def setBase_guesses(value: Double): Self = StObject.set(x, "base_guesses", value.asInstanceOf[js.Any])
      
      inline def setBase_matches(value: String): Self = StObject.set(x, "base_matches", value.asInstanceOf[js.Any])
      
      inline def setBase_token(value: String): Self = StObject.set(x, "base_token", value.asInstanceOf[js.Any])
      
      inline def setDictionary_name(value: String): Self = StObject.set(x, "dictionary_name", value.asInstanceOf[js.Any])
      
      inline def setGuesses(value: Double): Self = StObject.set(x, "guesses", value.asInstanceOf[js.Any])
      
      inline def setGuesses_log10(value: Double): Self = StObject.set(x, "guesses_log10", value.asInstanceOf[js.Any])
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setJ(value: Double): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
      
      inline def setL33t(value: Boolean): Self = StObject.set(x, "l33t", value.asInstanceOf[js.Any])
      
      inline def setL33t_variations(value: Double): Self = StObject.set(x, "l33t_variations", value.asInstanceOf[js.Any])
      
      inline def setMatched_word(value: String): Self = StObject.set(x, "matched_word", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      inline def setRepeat_count(value: Double): Self = StObject.set(x, "repeat_count", value.asInstanceOf[js.Any])
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setSequence_name(value: String): Self = StObject.set(x, "sequence_name", value.asInstanceOf[js.Any])
      
      inline def setSequence_space(value: Double): Self = StObject.set(x, "sequence_space", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUppercase_variations(value: Double): Self = StObject.set(x, "uppercase_variations", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ZXCVBNFeedbackWarning extends StObject
}
