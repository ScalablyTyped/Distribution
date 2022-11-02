package typings.zipJsZipJs.mod

import typings.std.AsyncGenerator
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@zip.js/zip.js", "ZipReader")
@js.native
open class ZipReader[Type] protected () extends StObject {
  def this(reader: js.Array[ReadableReader | ReadableStream[Any] | Reader[Any]]) = this()
  def this(reader: ReadableStream[Any]) = this()
  def this(reader: ReadableReader) = this()
  /**
    * Creates the instance
    * 
    * @param reader The {@link Reader} instance used to read data.
    * @param options The options.
    */
  def this(reader: Reader[Type]) = this()
  def this(
    reader: js.Array[ReadableReader | ReadableStream[Any] | Reader[Any]],
    options: ZipReaderConstructorOptions
  ) = this()
  def this(reader: ReadableStream[Any], options: ZipReaderConstructorOptions) = this()
  def this(reader: ReadableReader, options: ZipReaderConstructorOptions) = this()
  def this(reader: Reader[Type], options: ZipReaderConstructorOptions) = this()
  
  /**
    * The data appended after the zip file.
    */
  var appendedData: js.UndefOr[js.typedarray.Uint8Array] = js.native
  
  /**
    * Closes the zip file
    */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * The global comment of the zip file.
    */
  var comment: js.typedarray.Uint8Array = js.native
  
  /**
    * Returns all the entries in the zip file
    * 
    * @param options The options.
    * @returns A promise resolving to an `array` of {@link Entry} instances.
    */
  def getEntries(): js.Promise[js.Array[Entry]] = js.native
  def getEntries(options: ZipReaderGetEntriesOptions): js.Promise[js.Array[Entry]] = js.native
  
  /**
    * Returns a generator used to iterate on all the entries in the zip file
    * 
    * @param options The options.
    * @returns An asynchrounous generator of {@link Entry} instances.
    */
  def getEntriesGenerator(): AsyncGenerator[Entry, Boolean, Any] = js.native
  def getEntriesGenerator(options: ZipReaderGetEntriesOptions): AsyncGenerator[Entry, Boolean, Any] = js.native
  
  /**
    * The data prepended before the zip file.
    */
  var prependedData: js.UndefOr[js.typedarray.Uint8Array] = js.native
}
