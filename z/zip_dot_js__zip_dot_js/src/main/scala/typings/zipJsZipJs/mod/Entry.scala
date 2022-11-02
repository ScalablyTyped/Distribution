package typings.zipJsZipJs.mod

import typings.std.AsyncGenerator
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entry
  extends StObject
     with EntryMetaData {
  
  @JSName("getData")
  def getData_MEntry[Type](writer: AsyncGenerator[Writer[Any] | WritableWriter | WritableStream[Any], Boolean, Any]): js.Promise[Type] = js.native
  @JSName("getData")
  def getData_MEntry[Type](
    writer: AsyncGenerator[Writer[Any] | WritableWriter | WritableStream[Any], Boolean, Any],
    options: EntryGetDataOptions
  ): js.Promise[Type] = js.native
  @JSName("getData")
  def getData_MEntry[Type](writer: WritableStream[Any]): js.Promise[Type] = js.native
  @JSName("getData")
  def getData_MEntry[Type](writer: WritableStream[Any], options: EntryGetDataOptions): js.Promise[Type] = js.native
  @JSName("getData")
  def getData_MEntry[Type](writer: WritableWriter): js.Promise[Type] = js.native
  @JSName("getData")
  def getData_MEntry[Type](writer: WritableWriter, options: EntryGetDataOptions): js.Promise[Type] = js.native
  /**
    * Returns the content of the entry
    * 
    * @param writer The {@link Writer} instance used to write the content of the entry.
    * @param options The options.
    * @returns A promise resolving to the type to data associated to `writer`.
    */
  @JSName("getData")
  def getData_MEntry[Type](writer: Writer[Type]): js.Promise[Type] = js.native
  @JSName("getData")
  def getData_MEntry[Type](writer: Writer[Type], options: EntryGetDataOptions): js.Promise[Type] = js.native
}
