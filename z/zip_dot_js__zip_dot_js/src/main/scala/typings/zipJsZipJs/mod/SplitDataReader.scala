package typings.zipJsZipJs.mod

import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@zip.js/zip.js", "SplitDataReader")
@js.native
open class SplitDataReader protected ()
  extends Reader[js.Array[ReadableReader | ReadableStream[Any] | Reader[Any]]] {
  /**
    * Creates the {@link Reader} instance
    * 
    * @param value The data to read.
    */
  def this(value: js.Array[ReadableReader | ReadableStream[Any] | Reader[Any]]) = this()
}
