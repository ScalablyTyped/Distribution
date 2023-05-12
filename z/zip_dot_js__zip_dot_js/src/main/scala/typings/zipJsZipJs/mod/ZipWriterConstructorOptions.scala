package typings.zipJsZipJs.mod

import typings.std.AbortSignal
import typings.zipJsZipJs.zipJsZipJsInts.`1`
import typings.zipJsZipJs.zipJsZipJsInts.`2`
import typings.zipJsZipJs.zipJsZipJsInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents options passed to the constructor of {@link ZipWriter}, {@link ZipWriter#add} and `{@link ZipDirectoryEntry}#export*`.
  */
trait ZipWriterConstructorOptions extends StObject {
  
  /**
    * `true` to write entry data in a buffer before appending it to the zip file.
    *
    * `bufferedWrite` is automatically set to `true` when compressing more than one entry in parallel.
    *
    * @defaultValue false
    */
  var bufferedWrite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The creation date.
    *
    * This option is ignored if the {@link ZipWriterConstructorOptions#extendedTimestamp} option is set to `false`.
    *
    * @defaultValue The current date.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * `true` to to add a data descriptor.
    *
    * When set to `false`, the {@link ZipWriterConstructorOptions#bufferedWrite} option  will automatically be set to `true`.
    *
    * @defaultValue true
    */
  var dataDescriptor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `true` to add the signature of the data descriptor.
    *
    * @defaultValue false
    */
  var dataDescriptorSignature: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The encryption strength (AES).
    *
    * @defaultValue 3
    */
  var encryptionStrength: js.UndefOr[`1` | `2` | `3`] = js.undefined
  
  /**
    * `true` to store extended timestamp extra fields.
    *
    * When set to `false`, the maximum last modification date cannot exceed November 31, 2107 and the maximum accuracy is 2 seconds.
    *
    * @defaultValue true
    */
  var extendedTimestamp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The external file attribute.
    *
    * @defaultValue 0
    */
  var externalFileAttribute: js.UndefOr[Double] = js.undefined
  
  /**
    * The internal file attribute.
    *
    * @defaultValue 0
    */
  var internalFileAttribute: js.UndefOr[Double] = js.undefined
  
  /**
    * `true` to keep the order of the entry physically in the zip file.
    *
    * When set to `true`, the use of web workers will be improved. However, it also prevents files larger than 4GB from being created without setting the `zip54` option to `true` explicitly.
    * Another solution to improve the use of web workers is to add entries from smallest to largest in uncompressed size.
    *
    * @defaultValue true
    */
  var keepOrder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The last access date.
    *
    * This option is ignored if the {@link ZipWriterConstructorOptions#extendedTimestamp} option is set to `false`.
    *
    * @defaultValue The current date.
    */
  var lastAccessDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last modification date.
    *
    * @defaultValue The current date.
    */
  var lastModDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The level of compression.
    *
    * The minimum value is 0 and means that no compression is applied. The maximum value is 9.
    *
    * @defaultValue 5
    */
  var level: js.UndefOr[Double] = js.undefined
  
  /**
    * `true` to write {@link EntryMetaData#externalFileAttribute} in MS-DOS format for folder entries.
    *
    * @defaultValue true
    */
  var msDosCompatible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The password used to encrypt the content of the entry.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * `true` to prevent closing of {@link WritableWriter#writable}.
    *
    * @defaultValue false
    */
  var preventClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The `AbortSignal` instance used to cancel the compression.
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * `false` to never write disk numbers in zip64 data.
    *
    * @defaultValue true
    */
  var supportZip64SplitFile: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The "Version" field.
    */
  var version: js.UndefOr[Double] = js.undefined
  
  /**
    * The "Version made by" field.
    *
    * @defaultValue 20
    */
  var versionMadeBy: js.UndefOr[Double] = js.undefined
  
  /**
    * `true` to use Zip64 to store the entry.
    *
    * `zip64` is automatically set to `true` when necessary (e.g. compressed data larger than 4GB or with unknown size).
    *
    * @defaultValue false
    */
  var zip64: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `true` to use the ZipCrypto algorithm to encrypt the content of the entry.
    *
    * It is not recommended to set `zipCrypto` to `true` because the ZipCrypto encryption can be easily broken.
    *
    * @defaultValue false
    */
  var zipCrypto: js.UndefOr[Boolean] = js.undefined
}
object ZipWriterConstructorOptions {
  
  inline def apply(): ZipWriterConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipWriterConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZipWriterConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setBufferedWrite(value: Boolean): Self = StObject.set(x, "bufferedWrite", value.asInstanceOf[js.Any])
    
    inline def setBufferedWriteUndefined: Self = StObject.set(x, "bufferedWrite", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDataDescriptor(value: Boolean): Self = StObject.set(x, "dataDescriptor", value.asInstanceOf[js.Any])
    
    inline def setDataDescriptorSignature(value: Boolean): Self = StObject.set(x, "dataDescriptorSignature", value.asInstanceOf[js.Any])
    
    inline def setDataDescriptorSignatureUndefined: Self = StObject.set(x, "dataDescriptorSignature", js.undefined)
    
    inline def setDataDescriptorUndefined: Self = StObject.set(x, "dataDescriptor", js.undefined)
    
    inline def setEncryptionStrength(value: `1` | `2` | `3`): Self = StObject.set(x, "encryptionStrength", value.asInstanceOf[js.Any])
    
    inline def setEncryptionStrengthUndefined: Self = StObject.set(x, "encryptionStrength", js.undefined)
    
    inline def setExtendedTimestamp(value: Boolean): Self = StObject.set(x, "extendedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setExtendedTimestampUndefined: Self = StObject.set(x, "extendedTimestamp", js.undefined)
    
    inline def setExternalFileAttribute(value: Double): Self = StObject.set(x, "externalFileAttribute", value.asInstanceOf[js.Any])
    
    inline def setExternalFileAttributeUndefined: Self = StObject.set(x, "externalFileAttribute", js.undefined)
    
    inline def setInternalFileAttribute(value: Double): Self = StObject.set(x, "internalFileAttribute", value.asInstanceOf[js.Any])
    
    inline def setInternalFileAttributeUndefined: Self = StObject.set(x, "internalFileAttribute", js.undefined)
    
    inline def setKeepOrder(value: Boolean): Self = StObject.set(x, "keepOrder", value.asInstanceOf[js.Any])
    
    inline def setKeepOrderUndefined: Self = StObject.set(x, "keepOrder", js.undefined)
    
    inline def setLastAccessDate(value: js.Date): Self = StObject.set(x, "lastAccessDate", value.asInstanceOf[js.Any])
    
    inline def setLastAccessDateUndefined: Self = StObject.set(x, "lastAccessDate", js.undefined)
    
    inline def setLastModDate(value: js.Date): Self = StObject.set(x, "lastModDate", value.asInstanceOf[js.Any])
    
    inline def setLastModDateUndefined: Self = StObject.set(x, "lastModDate", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMsDosCompatible(value: Boolean): Self = StObject.set(x, "msDosCompatible", value.asInstanceOf[js.Any])
    
    inline def setMsDosCompatibleUndefined: Self = StObject.set(x, "msDosCompatible", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPreventClose(value: Boolean): Self = StObject.set(x, "preventClose", value.asInstanceOf[js.Any])
    
    inline def setPreventCloseUndefined: Self = StObject.set(x, "preventClose", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSupportZip64SplitFile(value: Boolean): Self = StObject.set(x, "supportZip64SplitFile", value.asInstanceOf[js.Any])
    
    inline def setSupportZip64SplitFileUndefined: Self = StObject.set(x, "supportZip64SplitFile", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionMadeBy(value: Double): Self = StObject.set(x, "versionMadeBy", value.asInstanceOf[js.Any])
    
    inline def setVersionMadeByUndefined: Self = StObject.set(x, "versionMadeBy", js.undefined)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setZip64(value: Boolean): Self = StObject.set(x, "zip64", value.asInstanceOf[js.Any])
    
    inline def setZip64Undefined: Self = StObject.set(x, "zip64", js.undefined)
    
    inline def setZipCrypto(value: Boolean): Self = StObject.set(x, "zipCrypto", value.asInstanceOf[js.Any])
    
    inline def setZipCryptoUndefined: Self = StObject.set(x, "zipCrypto", js.undefined)
  }
}
