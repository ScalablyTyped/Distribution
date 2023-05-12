package typings.zxingTextEncoding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsCommonStreamMod {
  
  @JSImport("@zxing/text-encoding/cjs/common/Stream", "Stream")
  @js.native
  open class Stream protected () extends StObject {
    /**
      *
      * @constructor
      * @param {!(Array.<number>|Uint8Array)} tokens Array of tokens that provide
      * the stream.
      */
    def this(tokens: js.Array[Double]) = this()
    def this(tokens: js.typedarray.Uint8Array) = this()
    
    /**
      * @return {boolean} True if end-of-stream has been hit.
      */
    def endOfStream(): Boolean = js.native
    
    def prepend(token: js.Array[Double]): Unit = js.native
    /**
      * When one or more tokens are prepended to a stream, those tokens
      * must be inserted, in given order, before the first token in the
      * stream.
      *
      * @param {(number|!Array.<number>)} token The token(s) to prepend to the
      * stream.
      */
    def prepend(token: Double): Unit = js.native
    
    def push(token: js.Array[Double]): Unit = js.native
    /**
      * When one or more tokens are pushed to a stream, those tokens
      * must be inserted, in given order, after the last token in the
      * stream.
      *
      * @param {(number|!Array.<number>)} token The tokens(s) to push to the
      * stream.
      */
    def push(token: Double): Unit = js.native
    
    /**
      * When a token is read from a stream, the first token in the
      * stream must be returned and subsequently removed, and
      * end-of-stream must be returned otherwise.
      *
      * @return {number} Get the next token from the stream, or
      * end_of_stream.
      */
    def read(): Double = js.native
    
    var tokens: js.Array[Double] = js.native
  }
}
