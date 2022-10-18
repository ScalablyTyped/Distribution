package typings.zipJsZipJs.mod

import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@zip.js/zip.js", "Writer")
@js.native
open class Writer[Type] ()
  extends StObject
     with Initializable
     with WritableWriter {
  
  /**
    * Retrieves all the written data
    * 
    * @returns A promise resolving to the written data.
    */
  def getData(): js.Promise[Type] = js.native
  
  /**
    * Initializes the instance asynchronously
    * 
    * @param size the total size of the written data in bytes.
    */
  @JSName("init")
  var init_Writer: js.UndefOr[js.Function1[/* size */ js.UndefOr[Double], js.Promise[Unit]]] = js.native
  
  /**
    * The `WritableStream` instance.
    */
  /* CompleteClass */
  var writable: WritableStream[Any] = js.native
  
  /**
    * Appends a chunk of data
    * 
    * @param array The chunk data to append.
    * 
    * @virtual
    */
  def writeUint8Array(array: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
}
