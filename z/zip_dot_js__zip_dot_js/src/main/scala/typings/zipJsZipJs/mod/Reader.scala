package typings.zipJsZipJs.mod

import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@zip.js/zip.js", "Reader")
@js.native
open class Reader[Type] protected ()
  extends StObject
     with Initializable
     with ReadableReader {
  /**
    * Creates the {@link Reader} instance
    * 
    * @param value The data to read.
    */
  def this(value: Type) = this()
  
  /**
    * Reads a chunk of data
    * 
    * @param index The byte index of the data to read.
    * @param length The length of the data to read in bytes.
    * @returns A promise resolving to a chunk of data.
    */
  def readUint8Array(index: Double, length: Double): js.Promise[js.typedarray.Uint8Array] = js.native
  
  /**
    * The `ReadableStream` instance.
    */
  /* CompleteClass */
  var readable: ReadableStream[Any] = js.native
  
  /**
    * The total size of the data in bytes.
    */
  var size: Double = js.native
}
