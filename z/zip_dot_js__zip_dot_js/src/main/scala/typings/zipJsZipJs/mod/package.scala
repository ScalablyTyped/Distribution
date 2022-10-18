package typings.zipJsZipJs.mod

import typings.std.TransformStream
import typings.zipJsZipJs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ERR_BAD_FORMAT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_BAD_FORMAT").asInstanceOf[String]

inline def ERR_CENTRAL_DIRECTORY_NOT_FOUND: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_CENTRAL_DIRECTORY_NOT_FOUND").asInstanceOf[String]

inline def ERR_DUPLICATED_NAME: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_DUPLICATED_NAME").asInstanceOf[String]

inline def ERR_ENCRYPTED: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_ENCRYPTED").asInstanceOf[String]

inline def ERR_EOCDR_LOCATOR_ZIP64_NOT_FOUND: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_EOCDR_LOCATOR_ZIP64_NOT_FOUND").asInstanceOf[String]

inline def ERR_EOCDR_NOT_FOUND: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_EOCDR_NOT_FOUND").asInstanceOf[String]

inline def ERR_EOCDR_ZIP64_NOT_FOUND: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_EOCDR_ZIP64_NOT_FOUND").asInstanceOf[String]

inline def ERR_EXTRAFIELD_ZIP64_NOT_FOUND: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_EXTRAFIELD_ZIP64_NOT_FOUND").asInstanceOf[String]

inline def ERR_HTTP_RANGE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_HTTP_RANGE").asInstanceOf[String]

inline def ERR_INVALID_COMMENT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_INVALID_COMMENT").asInstanceOf[String]

inline def ERR_INVALID_ENCRYPTION_STRENGTH: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_INVALID_ENCRYPTION_STRENGTH").asInstanceOf[String]

inline def ERR_INVALID_ENTRY_COMMENT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_INVALID_ENTRY_COMMENT").asInstanceOf[String]

inline def ERR_INVALID_ENTRY_NAME: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_INVALID_ENTRY_NAME").asInstanceOf[String]

inline def ERR_INVALID_EXTRAFIELD_DATA: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_INVALID_EXTRAFIELD_DATA").asInstanceOf[String]

inline def ERR_INVALID_EXTRAFIELD_TYPE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_INVALID_EXTRAFIELD_TYPE").asInstanceOf[String]

inline def ERR_INVALID_PASSWORD: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_INVALID_PASSWORD").asInstanceOf[String]

inline def ERR_INVALID_SIGNATURE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_INVALID_SIGNATURE").asInstanceOf[String]

inline def ERR_INVALID_VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_INVALID_VERSION").asInstanceOf[String]

inline def ERR_ITERATOR_COMPLETED_TOO_SOON: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_ITERATOR_COMPLETED_TOO_SOON").asInstanceOf[String]

inline def ERR_LOCAL_FILE_HEADER_NOT_FOUND: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_LOCAL_FILE_HEADER_NOT_FOUND").asInstanceOf[String]

inline def ERR_SPLIT_ZIP_FILE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_SPLIT_ZIP_FILE").asInstanceOf[String]

inline def ERR_UNSUPPORTED_COMPRESSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_UNSUPPORTED_COMPRESSION").asInstanceOf[String]

inline def ERR_UNSUPPORTED_ENCRYPTION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_UNSUPPORTED_ENCRYPTION").asInstanceOf[String]

inline def ERR_UNSUPPORTED_FORMAT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERR_UNSUPPORTED_FORMAT").asInstanceOf[String]

inline def configure(configuration: Configuration): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configuration.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def getMimeType(fileExtension: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMimeType")(fileExtension.asInstanceOf[js.Any]).asInstanceOf[String]

inline def initShimAsyncCodec(library: EventBasedZipLibrary, constructorOptions: Any, registerDataHandler: registerDataHandler): ZipLibrary = (^.asInstanceOf[js.Dynamic].applyDynamic("initShimAsyncCodec")(library.asInstanceOf[js.Any], constructorOptions.asInstanceOf[js.Any], registerDataHandler.asInstanceOf[js.Any])).asInstanceOf[ZipLibrary]
inline def initShimAsyncCodec(library: EventBasedZipLibrary, constructorOptions: Null, registerDataHandler: registerDataHandler): ZipLibrary = (^.asInstanceOf[js.Dynamic].applyDynamic("initShimAsyncCodec")(library.asInstanceOf[js.Any], constructorOptions.asInstanceOf[js.Any], registerDataHandler.asInstanceOf[js.Any])).asInstanceOf[ZipLibrary]

inline def terminateWorkers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("terminateWorkers")().asInstanceOf[Unit]

/**
  * Represents a class implementing `CompressionStream` or `DecompressionStream` interfaces.
  */
type CodecStream = TransformStream[Any, Any]

/** 
  * Represents a URL stored into a `string`.
  */
// deno-lint-ignore no-empty-interface
type URLString = String

/**
  * Represents the callback function used to handle `data` events.
  */
type dataHandler = js.Function1[/* data */ js.typedarray.Uint8Array, Unit]

/**
  * Represents the callback function used to register the `data` event handler.
  */
type registerDataHandler = js.Function2[/* codec */ EventBasedCodec, /* onData */ dataHandler, Unit]
