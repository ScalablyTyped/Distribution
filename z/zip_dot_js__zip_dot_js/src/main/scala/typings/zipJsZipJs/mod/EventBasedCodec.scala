package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an event-based implementation of a third-party codec.
  */
@js.native
trait EventBasedCodec extends StObject {
  
  /**
    * The function called when a chunk of data has been compressed/decompressed.
    * 
    * @param data The chunk of compressed/decompressed data.
    */
  def ondata(): Unit = js.native
  def ondata(data: js.typedarray.Uint8Array): Unit = js.native
  
  /**
    * Appends a chunk of data to compress/decompress
    * 
    * @param data The chunk of data to append.
    */
  def push(data: js.typedarray.Uint8Array): Unit = js.native
}
