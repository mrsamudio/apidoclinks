package io.github.mrsamudio;

import java.util.HashMap;

/**
 * ApiDocLinks class
 * 
 * @author mikodev
 *
 */
public class ApiDocLinks {

	private static final String JAVA11_DOMAIN = "https://docs.oracle.com/en/java/javase/11/docs/api/";
	private static final String JAVA17_DOMAIN = "https://docs.oracle.com/en/java/javase/17/docs/api/";
	private static String AEM_DOMAIN = "https://developer.adobe.com/experience-manager/reference-materials/6-5/javadoc/";

	private static final HashMap<String, String> EXCEPTIONURLS = fillGreatHash();

	/**
	 * Get a url official api doc
	 * 
	 * @param exceptionClass the exception class
	 * @return string url
	 */
	public static final String getUrl(Class<? extends Throwable> exceptionClass) {
		HashMap<String, String> exceptionUrls = fillGreatHash();
		return exceptionUrls.get(exceptionClass.getName());
	}

	/**
	 * Just print info or related class with url offical api doc
	 * 
	 * @param exceptionClass the exception class
	 * @return true or false depends on
	 */
	public static final boolean printInfo(Class<? extends Throwable> exceptionClass) {
		if (!EXCEPTIONURLS.get(exceptionClass.getName()).isEmpty()) {
			System.out.println("Nombre de Clase: " + exceptionClass.getName());
			System.out.println("Documentación oficial: " + EXCEPTIONURLS.get(exceptionClass.getName()));
			return true;
		} else {
			System.out.println(
					"No se encontró la URL de documentación oficial para la excepción " + exceptionClass.getName());
			return false;
		}
	}

	/**
	 * Get a url official aem api doc
	 * 
	 * @param exceptionClass the exception class
	 * @return String aem url
	 */
	public static final String getAEMUrl(Class<? extends Throwable>  exceptionClass) {
		HashMap<String, String> exceptionUrls = fillAEMHash();
		return exceptionUrls.get(exceptionClass.getName());
	}

	/**
	 * fillGreatHash
	 * 
	 * @return hashMap with all urls api docs
	 */
	private static final HashMap<String, String> fillGreatHash() {
		HashMap<String, String> urls = new HashMap<>();
		urls.putAll(fillJavaHash());
		urls.putAll(fillAEMHash());

		return urls;
	}



	/**
	 * fillJavaHash
	 * 
	 * @return hashMap with java urls api docs
	 */
	private static final HashMap<String, String> fillJavaHash() {
		HashMap<String, String> urls = new HashMap<>();
		urls.put("java.io.CharConversionException",
				JAVA11_DOMAIN.concat("java.base/java/io/CharConversionException.html"));
		urls.put("java.io.EOFException", JAVA11_DOMAIN.concat("java.base/java/io/EOFException.html"));
		urls.put("java.io.FileNotFoundException", JAVA11_DOMAIN.concat("java.base/java/io/FileNotFoundException.html"));
		urls.put("java.io.IOException", JAVA11_DOMAIN.concat("java.base/java/io/IOException.html"));
		urls.put("java.io.InterruptedIOException",
				JAVA11_DOMAIN.concat("java.base/java/io/InterruptedIOException.html"));
		urls.put("java.io.InvalidClassException", JAVA11_DOMAIN.concat("java.base/java/io/InvalidClassException.html"));
		urls.put("java.io.InvalidObjectException",
				JAVA11_DOMAIN.concat("java.base/java/io/InvalidObjectException.html"));
		urls.put("java.io.NotActiveException", JAVA11_DOMAIN.concat("java.base/java/io/NotActiveException.html"));
		urls.put("java.io.NotSerializableException",
				JAVA11_DOMAIN.concat("java.base/java/io/NotSerializableException.html"));
		urls.put("java.io.ObjectStreamException", JAVA11_DOMAIN.concat("java.base/java/io/ObjectStreamException.html"));
		urls.put("java.io.OptionalDataException", JAVA11_DOMAIN.concat("java.base/java/io/OptionalDataException.html"));
		urls.put("java.io.StreamCorruptedException",
				JAVA11_DOMAIN.concat("java.base/java/io/StreamCorruptedException.html"));
		urls.put("java.io.SyncFailedException", JAVA11_DOMAIN.concat("java.base/java/io/SyncFailedException.html"));
		urls.put("java.io.UTFDataFormatException",
				JAVA11_DOMAIN.concat("java.base/java/io/UTFDataFormatException.html"));
		urls.put("java.io.UncheckedIOException", JAVA11_DOMAIN.concat("java.base/java/io/UncheckedIOException.html"));
		urls.put("java.io.UnsupportedEncodingException",
				JAVA11_DOMAIN.concat("java.base/java/io/UnsupportedEncodingException.html"));
		urls.put("java.io.WriteAbortedException", JAVA11_DOMAIN.concat("java.base/java/io/WriteAbortedException.html"));
		urls.put("java.lang.ArithmeticException", JAVA11_DOMAIN.concat("java.base/java/lang/ArithmeticException.html"));
		urls.put("java.lang.ArrayIndexOutOfBoundsException",
				JAVA11_DOMAIN.concat("java.base/java/lang/ArrayIndexOutOfBoundsException.html"));
		urls.put("java.lang.ArrayStoreException", JAVA11_DOMAIN.concat("java.base/java/lang/ArrayStoreException.html"));
		urls.put("java.langCastException", JAVA11_DOMAIN.concat("java.base/java/lang/ClassCastException.html"));
		urls.put("java.langNotFoundException", JAVA11_DOMAIN.concat("java.base/java/lang/ClassNotFoundException.html"));
		urls.put("java.lang.CloneNotSupportedException",
				JAVA11_DOMAIN.concat("java.base/java/lang/CloneNotSupportedException.html"));
		urls.put("java.lang.EnumConstantNotPresentException",
				JAVA11_DOMAIN.concat("java.base/java/lang/EnumConstantNotPresentException.html"));
		urls.put("java.lang.Exception", JAVA11_DOMAIN.concat("java.base/java/lang/Exception.html"));
		urls.put("java.lang.ExceptionInInitializerError",
				JAVA11_DOMAIN.concat("java.base/java/lang/ExceptionInInitializerError.html"));
		urls.put("java.lang.IllegalAccessException",
				JAVA11_DOMAIN.concat("java.base/java/lang/IllegalAccessException.html"));
		urls.put("java.lang.IllegalArgumentException",
				JAVA11_DOMAIN.concat("java.base/java/lang/IllegalArgumentException.html"));
		urls.put("java.lang.IllegalCallerException",
				JAVA11_DOMAIN.concat("java.base/java/lang/IllegalCallerException.html"));
		urls.put("java.lang.IllegalMonitorStateException",
				JAVA11_DOMAIN.concat("java.base/java/lang/IllegalMonitorStateException.html"));
		urls.put("java.lang.IllegalStateException",
				JAVA11_DOMAIN.concat("java.base/java/lang/IllegalStateException.html"));
		urls.put("java.lang.IllegalThreadStateException",
				JAVA11_DOMAIN.concat("java.base/java/lang/IllegalThreadStateException.html"));
		urls.put("java.lang.IndexOutOfBoundsException",
				JAVA11_DOMAIN.concat("java.base/java/lang/IndexOutOfBoundsException.html"));
		urls.put("java.lang.InstantiationException",
				JAVA11_DOMAIN.concat("java.base/java/lang/InstantiationException.html"));
		urls.put("java.lang.InterruptedException",
				JAVA11_DOMAIN.concat("java.base/java/lang/InterruptedException.html"));
		urls.put("java.lang.LayerInstantiationException",
				JAVA11_DOMAIN.concat("java.base/java/lang/LayerInstantiationException.html"));
		urls.put("java.lang.NegativeArraySizeException",
				JAVA11_DOMAIN.concat("java.base/java/lang/NegativeArraySizeException.html"));
		urls.put("java.lang.NoSuchFieldException",
				JAVA11_DOMAIN.concat("java.base/java/lang/NoSuchFieldException.html"));
		urls.put("java.lang.NoSuchMethodException",
				JAVA11_DOMAIN.concat("java.base/java/lang/NoSuchMethodException.html"));
		urls.put("java.lang.NullPointerException",
				JAVA11_DOMAIN.concat("java.base/java/lang/NullPointerException.html"));
		urls.put("java.lang.NumberFormatException",
				JAVA11_DOMAIN.concat("java.base/java/lang/NumberFormatException.html"));
		urls.put("java.lang.ReflectiveOperationException",
				JAVA11_DOMAIN.concat("java.base/java/lang/ReflectiveOperationException.html"));
		urls.put("java.lang.RuntimeException", JAVA11_DOMAIN.concat("java.base/java/lang/RuntimeException.html"));
		urls.put("java.lang.SecurityException", JAVA11_DOMAIN.concat("java.base/java/lang/SecurityException.html"));
		urls.put("java.lang.StringIndexOutOfBoundsException",
				JAVA11_DOMAIN.concat("java.base/java/lang/StringIndexOutOfBoundsException.html"));
//					urls.put("java.lang.Thread.UncaughtExceptionHandler", DOMAIN.concat("java.base/java/lang/Thread.UncaughtExceptionHandler.html"));
		urls.put("java.lang.TypeNotPresentException",
				JAVA11_DOMAIN.concat("java.base/java/lang/TypeNotPresentException.html"));
		urls.put("java.lang.UnsupportedOperationException",
				JAVA11_DOMAIN.concat("java.base/java/lang/UnsupportedOperationException.html"));
		urls.put("java.lang.annotation.AnnotationTypeMismatchException",
				JAVA11_DOMAIN.concat("java.base/java/lang/annotation/AnnotationTypeMismatchException.html"));
		urls.put("java.lang.annotation.IncompleteAnnotationException",
				JAVA11_DOMAIN.concat("java.base/java/lang/annotation/IncompleteAnnotationException.html"));
		urls.put("java.lang.invoke.LambdaConversionException",
				JAVA11_DOMAIN.concat("java.base/java/lang/invoke/LambdaConversionException.html"));
		urls.put("java.lang.invoke.StringConcatException",
				JAVA11_DOMAIN.concat("java.base/java/lang/invoke/StringConcatException.html"));
		urls.put("java.lang.invoke.WrongMethodTypeException",
				JAVA11_DOMAIN.concat("java.base/java/lang/invoke/WrongMethodTypeException.html"));
		urls.put("java.lang.module.FindException",
				JAVA11_DOMAIN.concat("java.base/java/lang/module/FindException.html"));
		urls.put("java.lang.module.InvalidModuleDescriptorException",
				JAVA11_DOMAIN.concat("java.base/java/lang/module/InvalidModuleDescriptorException.html"));
		urls.put("java.lang.module.ResolutionException",
				JAVA11_DOMAIN.concat("java.base/java/lang/module/ResolutionException.html"));
		urls.put("java.lang.reflect.InaccessibleObjectException",
				JAVA11_DOMAIN.concat("java.base/java/lang/reflect/InaccessibleObjectException.html"));
		urls.put("java.lang.reflect.InvocationTargetException",
				JAVA11_DOMAIN.concat("java.base/java/lang/reflect/InvocationTargetException.html"));
		urls.put("java.lang.reflect.MalformedParameterizedTypeException",
				JAVA11_DOMAIN.concat("java.base/java/lang/reflect/MalformedParameterizedTypeException.html"));
		urls.put("java.lang.reflect.MalformedParametersException",
				JAVA11_DOMAIN.concat("java.base/java/lang/reflect/MalformedParametersException.html"));
		urls.put("java.lang.reflect.UndeclaredThrowableException",
				JAVA11_DOMAIN.concat("java.base/java/lang/reflect/UndeclaredThrowableException.html"));
		urls.put("java.net.BindException", JAVA11_DOMAIN.concat("java.base/java/net/BindException.html"));
		urls.put("java.net.ConnectException", JAVA11_DOMAIN.concat("java.base/java/net/ConnectException.html"));
		urls.put("java.net.HttpRetryException", JAVA11_DOMAIN.concat("java.base/java/net/HttpRetryException.html"));
		urls.put("java.net.MalformedURLException",
				JAVA11_DOMAIN.concat("java.base/java/net/MalformedURLException.html"));
		urls.put("java.net.NoRouteToHostException",
				JAVA11_DOMAIN.concat("java.base/java/net/NoRouteToHostException.html"));
		urls.put("java.net.PortUnreachableException",
				JAVA11_DOMAIN.concat("java.base/java/net/PortUnreachableException.html"));
		urls.put("java.net.ProtocolException", JAVA11_DOMAIN.concat("java.base/java/net/ProtocolException.html"));
		urls.put("java.net.SocketException", JAVA11_DOMAIN.concat("java.base/java/net/SocketException.html"));
		urls.put("java.net.SocketTimeoutException",
				JAVA11_DOMAIN.concat("java.base/java/net/SocketTimeoutException.html"));
		urls.put("java.net.URISyntaxException", JAVA11_DOMAIN.concat("java.base/java/net/URISyntaxException.html"));
		urls.put("java.net.UnknownHostException", JAVA11_DOMAIN.concat("java.base/java/net/UnknownHostException.html"));
		urls.put("java.net.UnknownServiceException",
				JAVA11_DOMAIN.concat("java.base/java/net/UnknownServiceException.html"));
		urls.put("java.nio.BufferOverflowException",
				JAVA11_DOMAIN.concat("java.base/java/nio/BufferOverflowException.html"));
		urls.put("java.nio.BufferUnderflowException",
				JAVA11_DOMAIN.concat("java.base/java/nio/BufferUnderflowException.html"));
		urls.put("java.nio.InvalidMarkException", JAVA11_DOMAIN.concat("java.base/java/nio/InvalidMarkException.html"));
		urls.put("java.nio.ReadOnlyBufferException",
				JAVA11_DOMAIN.concat("java.base/java/nio/ReadOnlyBufferException.html"));
		urls.put("java.nio.channels.AcceptPendingException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/AcceptPendingException.html"));
		urls.put("java.nio.channels.AlreadyBoundException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/AlreadyBoundException.html"));
		urls.put("java.nio.channels.AlreadyConnectedException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/AlreadyConnectedException.html"));
		urls.put("java.nio.channels.AsynchronousCloseException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/AsynchronousCloseException.html"));
		urls.put("java.nio.channels.CancelledKeyException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/CancelledKeyException.html"));
		urls.put("java.nio.channels.ClosedByInterruptException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/ClosedByInterruptException.html"));
		urls.put("java.nio.channels.ClosedChannelException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/ClosedChannelException.html"));
		urls.put("java.nio.channels.ClosedSelectorException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/ClosedSelectorException.html"));
		urls.put("java.nio.channels.ConnectionPendingException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/ConnectionPendingException.html"));
		urls.put("java.nio.channels.FileLockInterruptionException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/FileLockInterruptionException.html"));
		urls.put("java.nio.channels.IllegalBlockingModeException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/IllegalBlockingModeException.html"));
		urls.put("java.nio.channels.IllegalChannelGroupException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/IllegalChannelGroupException.html"));
		urls.put("java.nio.channels.IllegalSelectorException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/IllegalSelectorException.html"));
		urls.put("java.nio.channels.InterruptedByTimeoutException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/InterruptedByTimeoutException.html"));
		urls.put("java.nio.channels.NoConnectionPendingException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/NoConnectionPendingException.html"));
		urls.put("java.nio.channels.NonReadableChannelException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/NonReadableChannelException.html"));
		urls.put("java.nio.channels.NonWritableChannelException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/NonWritableChannelException.html"));
		urls.put("java.nio.channels.NotYetBoundException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/NotYetBoundException.html"));
		urls.put("java.nio.channels.NotYetConnectedException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/NotYetConnectedException.html"));
		urls.put("java.nio.channels.OverlappingFileLockException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/OverlappingFileLockException.html"));
		urls.put("java.nio.channels.ReadPendingException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/ReadPendingException.html"));
		urls.put("java.nio.channels.ShutdownChannelGroupException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/ShutdownChannelGroupException.html"));
		urls.put("java.nio.channels.UnresolvedAddressException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/UnresolvedAddressException.html"));
		urls.put("java.nio.channels.UnsupportedAddressTypeException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/UnsupportedAddressTypeException.html"));
		urls.put("java.nio.channels.WritePendingException",
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/WritePendingException.html"));
		urls.put("java.nio.charset.CharacterCodingException",
				JAVA11_DOMAIN.concat("java.base/java/nio/charset/CharacterCodingException.html"));
		urls.put("java.nio.charset.IllegalCharsetNameException",
				JAVA11_DOMAIN.concat("java.base/java/nio/charset/IllegalCharsetNameException.html"));
		urls.put("java.nio.charset.MalformedInputException",
				JAVA11_DOMAIN.concat("java.base/java/nio/charset/MalformedInputException.html"));
		urls.put("java.nio.charset.UnmappableCharacterException",
				JAVA11_DOMAIN.concat("java.base/java/nio/charset/UnmappableCharacterException.html"));
		urls.put("java.nio.charset.UnsupportedCharsetException",
				JAVA11_DOMAIN.concat("java.base/java/nio/charset/UnsupportedCharsetException.html"));
		urls.put("java.nio.file.AccessDeniedException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/AccessDeniedException.html"));
		urls.put("java.nio.file.AtomicMoveNotSupportedException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/AtomicMoveNotSupportedException.html"));
		urls.put("java.nio.file.ClosedDirectoryStreamException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/ClosedDirectoryStreamException.html"));
		urls.put("java.nio.file.ClosedFileSystemException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/ClosedFileSystemException.html"));
		urls.put("java.nio.file.ClosedWatchServiceException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/ClosedWatchServiceException.html"));
		urls.put("java.nio.file.DirectoryIteratorException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/DirectoryIteratorException.html"));
		urls.put("java.nio.file.DirectoryNotEmptyException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/DirectoryNotEmptyException.html"));
		urls.put("java.nio.file.FileAlreadyExistsException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/FileAlreadyExistsException.html"));
		urls.put("java.nio.file.FileSystemAlreadyExistsException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/FileSystemAlreadyExistsException.html"));
		urls.put("java.nio.file.FileSystemException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/FileSystemException.html"));
		urls.put("java.nio.file.FileSystemLoopException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/FileSystemLoopException.html"));
		urls.put("java.nio.file.FileSystemNotFoundException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/FileSystemNotFoundException.html"));
		urls.put("java.nio.file.InvalidPathException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/InvalidPathException.html"));
		urls.put("java.nio.file.NoSuchFileException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/NoSuchFileException.html"));
		urls.put("java.nio.file.NotDirectoryException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/NotDirectoryException.html"));
		urls.put("java.nio.file.NotLinkException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/NotLinkException.html"));
		urls.put("java.nio.file.ProviderMismatchException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/ProviderMismatchException.html"));
		urls.put("java.nio.file.ProviderNotFoundException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/ProviderNotFoundException.html"));
		urls.put("java.nio.file.ReadOnlyFileSystemException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/ReadOnlyFileSystemException.html"));
		urls.put("java.nio.file.attribute.UserPrincipalNotFoundException",
				JAVA11_DOMAIN.concat("java.base/java/nio/file/attribute/UserPrincipalNotFoundException.html"));
		urls.put("java.security.AccessControlException",
				JAVA11_DOMAIN.concat("java.base/java/security/AccessControlException.html"));
		urls.put("java.security.DigestException", JAVA11_DOMAIN.concat("java.base/java/security/DigestException.html"));
		urls.put("java.security.GeneralSecurityException",
				JAVA11_DOMAIN.concat("java.base/java/security/GeneralSecurityException.html"));
		urls.put("java.security.InvalidAlgorithmParameterException",
				JAVA11_DOMAIN.concat("java.base/java/security/InvalidAlgorithmParameterException.html"));
		urls.put("java.security.InvalidKeyException",
				JAVA11_DOMAIN.concat("java.base/java/security/InvalidKeyException.html"));
		urls.put("java.security.InvalidParameterException",
				JAVA11_DOMAIN.concat("java.base/java/security/InvalidParameterException.html"));
		urls.put("java.security.KeyException", JAVA11_DOMAIN.concat("java.base/java/security/KeyException.html"));
		urls.put("java.security.KeyManagementException",
				JAVA11_DOMAIN.concat("java.base/java/security/KeyManagementException.html"));
		urls.put("java.security.KeyStoreException",
				JAVA11_DOMAIN.concat("java.base/java/security/KeyStoreException.html"));
		urls.put("java.security.NoSuchAlgorithmException",
				JAVA11_DOMAIN.concat("java.base/java/security/NoSuchAlgorithmException.html"));
		urls.put("java.security.NoSuchProviderException",
				JAVA11_DOMAIN.concat("java.base/java/security/NoSuchProviderException.html"));
		urls.put("java.security.PrivilegedActionException",
				JAVA11_DOMAIN.concat("java.base/java/security/PrivilegedActionException.html"));
//					urls.put("java.security.PrivilegedExceptionAction", DOMAIN.concat("java.base/java/security/PrivilegedExceptionAction.html"));
		urls.put("java.security.ProviderException",
				JAVA11_DOMAIN.concat("java.base/java/security/ProviderException.html"));
		urls.put("java.security.SignatureException",
				JAVA11_DOMAIN.concat("java.base/java/security/SignatureException.html"));
		urls.put("java.security.UnrecoverableEntryException",
				JAVA11_DOMAIN.concat("java.base/java/security/UnrecoverableEntryException.html"));
		urls.put("java.security.UnrecoverableKeyException",
				JAVA11_DOMAIN.concat("java.base/java/security/UnrecoverableKeyException.html"));
		urls.put("java.security.cert.CRLException",
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CRLException.html"));
		urls.put("java.security.cert.CertPathBuilderException",
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertPathBuilderException.html"));
//					urls.put("java.security.cert.CertPathValidatorException.BasicReason", DOMAIN.concat("java.base/java/security/cert/CertPathValidatorException.BasicReason.html"));
//					urls.put("java.security.cert.CertPathValidatorException.Reason", DOMAIN.concat("java.base/java/security/cert/CertPathValidatorException.Reason.html"));
		urls.put("java.security.cert.CertPathValidatorException",
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertPathValidatorException.html"));
		urls.put("java.security.cert.CertStoreException",
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertStoreException.html"));
		urls.put("java.security.cert.CertificateEncodingException",
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertificateEncodingException.html"));
		urls.put("java.security.cert.CertificateException",
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertificateException.html"));
		urls.put("java.security.cert.CertificateExpiredException",
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertificateExpiredException.html"));
		urls.put("java.security.cert.CertificateNotYetValidException",
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertificateNotYetValidException.html"));
		urls.put("java.security.cert.CertificateParsingException",
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertificateParsingException.html"));
		urls.put("java.security.cert.CertificateRevokedException",
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertificateRevokedException.html"));
		urls.put("java.security.spec.InvalidKeySpecException",
				JAVA11_DOMAIN.concat("java.base/java/security/spec/InvalidKeySpecException.html"));
		urls.put("java.security.spec.InvalidParameterSpecException",
				JAVA11_DOMAIN.concat("java.base/java/security/spec/InvalidParameterSpecException.html"));
		urls.put("java.text.ParseException", JAVA11_DOMAIN.concat("java.base/java/text/ParseException.html"));
		urls.put("java.time.DateTimeException", JAVA11_DOMAIN.concat("java.base/java/time/DateTimeException.html"));
		urls.put("java.time.format.DateTimeParseException",
				JAVA11_DOMAIN.concat("java.base/java/time/format/DateTimeParseException.html"));
		urls.put("java.time.temporal.UnsupportedTemporalTypeException",
				JAVA11_DOMAIN.concat("java.base/java/time/temporal/UnsupportedTemporalTypeException.html"));
		urls.put("java.time.zone.ZoneRulesException",
				JAVA11_DOMAIN.concat("java.base/java/time/zone/ZoneRulesException.html"));
		urls.put("java.util.ConcurrentModificationException",
				JAVA11_DOMAIN.concat("java.base/java/util/ConcurrentModificationException.html"));
		urls.put("java.util.DuplicateFormatFlagsException",
				JAVA11_DOMAIN.concat("java.base/java/util/DuplicateFormatFlagsException.html"));
		urls.put("java.util.EmptyStackException", JAVA11_DOMAIN.concat("java.base/java/util/EmptyStackException.html"));
		urls.put("java.util.FormatFlagsConversionMismatchException",
				JAVA11_DOMAIN.concat("java.base/java/util/FormatFlagsConversionMismatchException.html"));
		urls.put("java.util.FormatterClosedException",
				JAVA11_DOMAIN.concat("java.base/java/util/FormatterClosedException.html"));
		urls.put("java.util.IllegalFormatCodePointException",
				JAVA11_DOMAIN.concat("java.base/java/util/IllegalFormatCodePointException.html"));
		urls.put("java.util.IllegalFormatConversionException",
				JAVA11_DOMAIN.concat("java.base/java/util/IllegalFormatConversionException.html"));
		urls.put("java.util.IllegalFormatException",
				JAVA11_DOMAIN.concat("java.base/java/util/IllegalFormatException.html"));
		urls.put("java.util.IllegalFormatFlagsException",
				JAVA11_DOMAIN.concat("java.base/java/util/IllegalFormatFlagsException.html"));
		urls.put("java.util.IllegalFormatPrecisionException",
				JAVA11_DOMAIN.concat("java.base/java/util/IllegalFormatPrecisionException.html"));
		urls.put("java.util.IllegalFormatWidthException",
				JAVA11_DOMAIN.concat("java.base/java/util/IllegalFormatWidthException.html"));
		urls.put("java.util.IllformedLocaleException",
				JAVA11_DOMAIN.concat("java.base/java/util/IllformedLocaleException.html"));
		urls.put("java.util.InputMismatchException",
				JAVA11_DOMAIN.concat("java.base/java/util/InputMismatchException.html"));
		urls.put("java.util.InvalidPropertiesFormatException",
				JAVA11_DOMAIN.concat("java.base/java/util/InvalidPropertiesFormatException.html"));
		urls.put("java.util.MissingFormatArgumentException",
				JAVA11_DOMAIN.concat("java.base/java/util/MissingFormatArgumentException.html"));
		urls.put("java.util.MissingFormatWidthException",
				JAVA11_DOMAIN.concat("java.base/java/util/MissingFormatWidthException.html"));
		urls.put("java.util.MissingResourceException",
				JAVA11_DOMAIN.concat("java.base/java/util/MissingResourceException.html"));
		urls.put("java.util.NoSuchElementException",
				JAVA11_DOMAIN.concat("java.base/java/util/NoSuchElementException.html"));
		urls.put("java.util.TooManyListenersException",
				JAVA11_DOMAIN.concat("java.base/java/util/TooManyListenersException.html"));
		urls.put("java.util.UnknownFormatConversionException",
				JAVA11_DOMAIN.concat("java.base/java/util/UnknownFormatConversionException.html"));
		urls.put("java.util.UnknownFormatFlagsException",
				JAVA11_DOMAIN.concat("java.base/java/util/UnknownFormatFlagsException.html"));
		urls.put("java.util.concurrent.BrokenBarrierException",
				JAVA11_DOMAIN.concat("java.base/java/util/concurrent/BrokenBarrierException.html"));
		urls.put("java.util.concurrent.CancellationException",
				JAVA11_DOMAIN.concat("java.base/java/util/concurrent/CancellationException.html"));
		urls.put("java.util.concurrent.CompletionException",
				JAVA11_DOMAIN.concat("java.base/java/util/concurrent/CompletionException.html"));
		urls.put("java.util.concurrent.ExecutionException",
				JAVA11_DOMAIN.concat("java.base/java/util/concurrent/ExecutionException.html"));
		urls.put("java.util.concurrent.RejectedExecutionException",
				JAVA11_DOMAIN.concat("java.base/java/util/concurrent/RejectedExecutionException.html"));
		urls.put("java.util.concurrent.TimeoutException",
				JAVA11_DOMAIN.concat("java.base/java/util/concurrent/TimeoutException.html"));
		urls.put("java.util.jar.JarException", JAVA11_DOMAIN.concat("java.base/java/util/jar/JarException.html"));
		urls.put("java.util.regex.PatternSyntaxException",
				JAVA11_DOMAIN.concat("java.base/java/util/regex/PatternSyntaxException.html"));
		urls.put("java.util.zip.DataFormatException",
				JAVA11_DOMAIN.concat("java.base/java/util/zip/DataFormatException.html"));
		urls.put("java.util.zip.ZipException", JAVA11_DOMAIN.concat("java.base/java/util/zip/ZipException.html"));
		urls.put("javax.crypto.AEADBadTagException",
				JAVA11_DOMAIN.concat("java.base/javax/crypto/AEADBadTagException.html"));
		urls.put("javax.crypto.BadPaddingException",
				JAVA11_DOMAIN.concat("java.base/javax/crypto/BadPaddingException.html"));
		urls.put("javax.crypto.ExemptionMechanismException",
				JAVA11_DOMAIN.concat("java.base/javax/crypto/ExemptionMechanismException.html"));
		urls.put("javax.crypto.IllegalBlockSizeException",
				JAVA11_DOMAIN.concat("java.base/javax/crypto/IllegalBlockSizeException.html"));
		urls.put("javax.crypto.NoSuchPaddingException",
				JAVA11_DOMAIN.concat("java.base/javax/crypto/NoSuchPaddingException.html"));
		urls.put("javax.crypto.ShortBufferException",
				JAVA11_DOMAIN.concat("java.base/javax/crypto/ShortBufferException.html"));
		urls.put("javax.net.ssl.SSLException", JAVA11_DOMAIN.concat("java.base/javax/net/ssl/SSLException.html"));
		urls.put("javax.net.ssl.SSLHandshakeException",
				JAVA11_DOMAIN.concat("java.base/javax/net/ssl/SSLHandshakeException.html"));
		urls.put("javax.net.ssl.SSLKeyException", JAVA11_DOMAIN.concat("java.base/javax/net/ssl/SSLKeyException.html"));
		urls.put("javax.net.ssl.SSLPeerUnverifiedException",
				JAVA11_DOMAIN.concat("java.base/javax/net/ssl/SSLPeerUnverifiedException.html"));
		urls.put("javax.net.ssl.SSLProtocolException",
				JAVA11_DOMAIN.concat("java.base/javax/net/ssl/SSLProtocolException.html"));
		urls.put("javax.security.auth.DestroyFailedException",
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/DestroyFailedException.html"));
		urls.put("javax.security.auth.RefreshFailedException",
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/RefreshFailedException.html"));
		urls.put("javax.security.auth.callback.UnsupportedCallbackException",
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/callback/UnsupportedCallbackException.html"));
		urls.put("javax.security.auth.login.AccountException",
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/AccountException.html"));
		urls.put("javax.security.auth.login.AccountExpiredException",
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/AccountExpiredException.html"));
		urls.put("javax.security.auth.login.AccountLockedException",
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/AccountLockedException.html"));
		urls.put("javax.security.auth.login.AccountNotFoundException",
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/AccountNotFoundException.html"));
		urls.put("javax.security.auth.login.CredentialException",
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/CredentialException.html"));
		urls.put("javax.security.auth.login.CredentialExpiredException",
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/CredentialExpiredException.html"));
		urls.put("javax.security.auth.login.CredentialNotFoundException",
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/CredentialNotFoundException.html"));
		urls.put("javax.security.auth.login.FailedLoginException",
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/FailedLoginException.html"));
		urls.put("javax.security.auth.login.LoginException",
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/LoginException.html"));
//					urls.put("javax.security.cert.CertificateEncodingException", DOMAIN.concat("java.base/javax/security/cert/CertificateEncodingException.html"));
//					urls.put("javax.security.cert.CertificateException", DOMAIN.concat("java.base/javax/security/cert/CertificateException.html"));
//					urls.put("javax.security.cert.CertificateExpiredException", DOMAIN.concat("java.base/javax/security/cert/CertificateExpiredException.html"));
//					urls.put("javax.security.cert.CertificateNotYetValidException", DOMAIN.concat("java.base/javax/security/cert/CertificateNotYetValidException.html"));
//					urls.put("javax.security.cert.CertificateParsingException", DOMAIN.concat("java.base/javax/security/cert/CertificateParsingException.html"));
		urls.put("javax.annotation.processing.FilerException",
				JAVA11_DOMAIN.concat("java.compiler/javax/annotation/processing/FilerException.html"));
		urls.put("javax.lang.model.UnknownEntityException",
				JAVA11_DOMAIN.concat("java.compiler/javax/lang/model/UnknownEntityException.html"));
		urls.put("javax.lang.model.element.UnknownAnnotationValueException",
				JAVA11_DOMAIN.concat("java.compiler/javax/lang/model/element/UnknownAnnotationValueException.html"));
		urls.put("javax.lang.model.element.UnknownDirectiveException",
				JAVA11_DOMAIN.concat("java.compiler/javax/lang/model/element/UnknownDirectiveException.html"));
		urls.put("javax.lang.model.element.UnknownElementException",
				JAVA11_DOMAIN.concat("java.compiler/javax/lang/model/element/UnknownElementException.html"));
		urls.put("javax.lang.model.type.MirroredTypeException",
				JAVA11_DOMAIN.concat("java.compiler/javax/lang/model/type/MirroredTypeException.html"));
		urls.put("javax.lang.model.type.MirroredTypesException",
				JAVA11_DOMAIN.concat("java.compiler/javax/lang/model/type/MirroredTypesException.html"));
		urls.put("javax.lang.model.type.UnknownTypeException",
				JAVA11_DOMAIN.concat("java.compiler/javax/lang/model/type/UnknownTypeException.html"));
		urls.put("java.awt.datatransfer.MimeTypeParseException",
				JAVA11_DOMAIN.concat("java.datatransfer/java/awt/datatransfer/MimeTypeParseException.html"));
		urls.put("java.awt.datatransfer.UnsupportedFlavorException",
				JAVA11_DOMAIN.concat("java.datatransfer/java/awt/datatransfer/UnsupportedFlavorException.html"));
		urls.put("java.awt.AWTException", JAVA11_DOMAIN.concat("java.desktop/java/awt/AWTException.html"));
		urls.put("java.awt.FontFormatException",
				JAVA11_DOMAIN.concat("java.desktop/java/awt/FontFormatException.html"));
		urls.put("java.awt.HeadlessException", JAVA11_DOMAIN.concat("java.desktop/java/awt/HeadlessException.html"));
		urls.put("java.awt.IllegalComponentStateException",
				JAVA11_DOMAIN.concat("java.desktop/java/awt/IllegalComponentStateException.html"));
		urls.put("java.awt.color.CMMException", JAVA11_DOMAIN.concat("java.desktop/java/awt/color/CMMException.html"));
		urls.put("java.awt.color.ProfileDataException",
				JAVA11_DOMAIN.concat("java.desktop/java/awt/color/ProfileDataException.html"));
		urls.put("java.awt.dnd.InvalidDnDOperationException",
				JAVA11_DOMAIN.concat("java.desktop/java/awt/dnd/InvalidDnDOperationException.html"));
		urls.put("java.awt.geom.IllegalPathStateException",
				JAVA11_DOMAIN.concat("java.desktop/java/awt/geom/IllegalPathStateException.html"));
		urls.put("java.awt.geom.NoninvertibleTransformException",
				JAVA11_DOMAIN.concat("java.desktop/java/awt/geom/NoninvertibleTransformException.html"));
		urls.put("java.awt.image.ImagingOpException",
				JAVA11_DOMAIN.concat("java.desktop/java/awt/image/ImagingOpException.html"));
		urls.put("java.awt.image.RasterFormatException",
				JAVA11_DOMAIN.concat("java.desktop/java/awt/image/RasterFormatException.html"));
		urls.put("java.awt.print.PrinterAbortException",
				JAVA11_DOMAIN.concat("java.desktop/java/awt/print/PrinterAbortException.html"));
		urls.put("java.awt.print.PrinterException",
				JAVA11_DOMAIN.concat("java.desktop/java/awt/print/PrinterException.html"));
		urls.put("java.awt.print.PrinterIOException",
				JAVA11_DOMAIN.concat("java.desktop/java/awt/print/PrinterIOException.html"));
//					urls.put("java.beans.ExceptionListener", DOMAIN.concat("java.desktop/java/beans/ExceptionListener.html"));
		urls.put("java.beans.IntrospectionException",
				JAVA11_DOMAIN.concat("java.desktop/java/beans/IntrospectionException.html"));
		urls.put("java.beans.PropertyVetoException",
				JAVA11_DOMAIN.concat("java.desktop/java/beans/PropertyVetoException.html"));
		urls.put("javax.imageio.IIOException", JAVA11_DOMAIN.concat("java.desktop/javax/imageio/IIOException.html"));
		urls.put("javax.imageio.metadata.IIOInvalidTreeException",
				JAVA11_DOMAIN.concat("java.desktop/javax/imageio/metadata/IIOInvalidTreeException.html"));
//					urls.put("javax.print.AttributeException", DOMAIN.concat("java.desktop/javax/print/AttributeException.html"));
//					urls.put("javax.print.FlavorException", DOMAIN.concat("java.desktop/javax/print/FlavorException.html"));
		urls.put("javax.print.PrintException", JAVA11_DOMAIN.concat("java.desktop/javax/print/PrintException.html"));
//					urls.put("javax.print.URIException", DOMAIN.concat("java.desktop/javax/print/URIException.html"));
		urls.put("javax.print.attribute.UnmodifiableSetException",
				JAVA11_DOMAIN.concat("java.desktop/javax/print/attribute/UnmodifiableSetException.html"));
		urls.put("javax.sound.midi.InvalidMidiDataException",
				JAVA11_DOMAIN.concat("java.desktop/javax/sound/midi/InvalidMidiDataException.html"));
		urls.put("javax.sound.midi.MidiUnavailableException",
				JAVA11_DOMAIN.concat("java.desktop/javax/sound/midi/MidiUnavailableException.html"));
		urls.put("javax.sound.sampled.LineUnavailableException",
				JAVA11_DOMAIN.concat("java.desktop/javax/sound/sampled/LineUnavailableException.html"));
		urls.put("javax.sound.sampled.UnsupportedAudioFileException",
				JAVA11_DOMAIN.concat("java.desktop/javax/sound/sampled/UnsupportedAudioFileException.html"));
		urls.put("javax.swing.UnsupportedLookAndFeelException",
				JAVA11_DOMAIN.concat("java.desktop/javax/swing/UnsupportedLookAndFeelException.html"));
		urls.put("javax.swing.text.BadLocationException",
				JAVA11_DOMAIN.concat("java.desktop/javax/swing/text/BadLocationException.html"));
		urls.put("javax.swing.text.ChangedCharSetException",
				JAVA11_DOMAIN.concat("java.desktop/javax/swing/text/ChangedCharSetException.html"));
		urls.put("javax.swing.tree.ExpandVetoException",
				JAVA11_DOMAIN.concat("java.desktop/javax/swing/tree/ExpandVetoException.html"));
		urls.put("javax.swing.undo.CannotRedoException",
				JAVA11_DOMAIN.concat("java.desktop/javax/swing/undo/CannotRedoException.html"));
		urls.put("javax.swing.undo.CannotUndoException",
				JAVA11_DOMAIN.concat("java.desktop/javax/swing/undo/CannotUndoException.html"));
		urls.put("java.lang.instrument.IllegalClassFormatException",
				JAVA11_DOMAIN.concat("java.instrument/java/lang/instrument/IllegalClassFormatException.html"));
		urls.put("java.lang.instrument.UnmodifiableClassException",
				JAVA11_DOMAIN.concat("java.instrument/java/lang/instrument/UnmodifiableClassException.html"));
		urls.put("java.lang.instrument.UnmodifiableModuleException",
				JAVA11_DOMAIN.concat("java.instrument/java/lang/instrument/UnmodifiableModuleException.html"));
		urls.put("javax.management.AttributeNotFoundException",
				JAVA11_DOMAIN.concat("java.management/javax/management/AttributeNotFoundException.html"));
		urls.put("javax.management.BadAttributeValueExpException",
				JAVA11_DOMAIN.concat("java.management/javax/management/BadAttributeValueExpException.html"));
		urls.put("javax.management.BadBinaryOpValueExpException",
				JAVA11_DOMAIN.concat("java.management/javax/management/BadBinaryOpValueExpException.html"));
		urls.put("javax.management.BadStringOperationException",
				JAVA11_DOMAIN.concat("java.management/javax/management/BadStringOperationException.html"));
		urls.put("javax.management.InstanceAlreadyExistsException",
				JAVA11_DOMAIN.concat("java.management/javax/management/InstanceAlreadyExistsException.html"));
		urls.put("javax.management.InstanceNotFoundException",
				JAVA11_DOMAIN.concat("java.management/javax/management/InstanceNotFoundException.html"));
		urls.put("javax.management.IntrospectionException",
				JAVA11_DOMAIN.concat("java.management/javax/management/IntrospectionException.html"));
		urls.put("javax.management.InvalidApplicationException",
				JAVA11_DOMAIN.concat("java.management/javax/management/InvalidApplicationException.html"));
		urls.put("javax.management.InvalidAttributeValueException",
				JAVA11_DOMAIN.concat("java.management/javax/management/InvalidAttributeValueException.html"));
		urls.put("javax.management.JMException",
				JAVA11_DOMAIN.concat("java.management/javax/management/JMException.html"));
		urls.put("javax.management.JMRuntimeException",
				JAVA11_DOMAIN.concat("java.management/javax/management/JMRuntimeException.html"));
		urls.put("javax.management.ListenerNotFoundException",
				JAVA11_DOMAIN.concat("java.management/javax/management/ListenerNotFoundException.html"));
		urls.put("javax.management.MBeanException",
				JAVA11_DOMAIN.concat("java.management/javax/management/MBeanException.html"));
		urls.put("javax.management.MBeanRegistrationException",
				JAVA11_DOMAIN.concat("java.management/javax/management/MBeanRegistrationException.html"));
		urls.put("javax.management.MalformedObjectNameException",
				JAVA11_DOMAIN.concat("java.management/javax/management/MalformedObjectNameException.html"));
		urls.put("javax.management.NotCompliantMBeanException",
				JAVA11_DOMAIN.concat("java.management/javax/management/NotCompliantMBeanException.html"));
		urls.put("javax.management.OperationsException",
				JAVA11_DOMAIN.concat("java.management/javax/management/OperationsException.html"));
		urls.put("javax.management.ReflectionException",
				JAVA11_DOMAIN.concat("java.management/javax/management/ReflectionException.html"));
		urls.put("javax.management.RuntimeErrorException",
				JAVA11_DOMAIN.concat("java.management/javax/management/RuntimeErrorException.html"));
		urls.put("javax.management.RuntimeMBeanException",
				JAVA11_DOMAIN.concat("java.management/javax/management/RuntimeMBeanException.html"));
		urls.put("javax.management.RuntimeOperationsException",
				JAVA11_DOMAIN.concat("java.management/javax/management/RuntimeOperationsException.html"));
		urls.put("javax.management.ServiceNotFoundException",
				JAVA11_DOMAIN.concat("java.management/javax/management/ServiceNotFoundException.html"));
		urls.put("javax.management.modelmbean.InvalidTargetObjectTypeException", JAVA11_DOMAIN
				.concat("java.management/javax/management/modelmbean/InvalidTargetObjectTypeException.html"));
		urls.put("javax.management.modelmbean.XMLParseException",
				JAVA11_DOMAIN.concat("java.management/javax/management/modelmbean/XMLParseException.html"));
		urls.put("javax.management.monitor.MonitorSettingException",
				JAVA11_DOMAIN.concat("java.management/javax/management/monitor/MonitorSettingException.html"));
		urls.put("javax.management.openmbean.InvalidKeyException",
				JAVA11_DOMAIN.concat("java.management/javax/management/openmbean/InvalidKeyException.html"));
		urls.put("javax.management.openmbean.InvalidOpenTypeException",
				JAVA11_DOMAIN.concat("java.management/javax/management/openmbean/InvalidOpenTypeException.html"));
		urls.put("javax.management.openmbean.KeyAlreadyExistsException",
				JAVA11_DOMAIN.concat("java.management/javax/management/openmbean/KeyAlreadyExistsException.html"));
		urls.put("javax.management.openmbean.OpenDataException",
				JAVA11_DOMAIN.concat("java.management/javax/management/openmbean/OpenDataException.html"));
		urls.put("javax.management.relation.InvalidRelationIdException",
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/InvalidRelationIdException.html"));
		urls.put("javax.management.relation.InvalidRelationServiceException",
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/InvalidRelationServiceException.html"));
		urls.put("javax.management.relation.InvalidRelationTypeException",
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/InvalidRelationTypeException.html"));
		urls.put("javax.management.relation.InvalidRoleInfoException",
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/InvalidRoleInfoException.html"));
		urls.put("javax.management.relation.InvalidRoleValueException",
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/InvalidRoleValueException.html"));
		urls.put("javax.management.relation.RelationException",
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/RelationException.html"));
		urls.put("javax.management.relation.RelationNotFoundException",
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/RelationNotFoundException.html"));
		urls.put("javax.management.relation.RelationServiceNotRegisteredException", JAVA11_DOMAIN
				.concat("java.management/javax/management/relation/RelationServiceNotRegisteredException.html"));
		urls.put("javax.management.relation.RelationTypeNotFoundException",
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/RelationTypeNotFoundException.html"));
		urls.put("javax.management.relation.RoleInfoNotFoundException",
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/RoleInfoNotFoundException.html"));
		urls.put("javax.management.relation.RoleNotFoundException",
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/RoleNotFoundException.html"));
		urls.put("javax.management.remote.JMXProviderException",
				JAVA11_DOMAIN.concat("java.management/javax/management/remote/JMXProviderException.html"));
		urls.put("javax.management.remote.JMXServerErrorException",
				JAVA11_DOMAIN.concat("java.management/javax/management/remote/JMXServerErrorException.html"));
		urls.put("javax.naming.AuthenticationException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/AuthenticationException.html"));
		urls.put("javax.naming.AuthenticationNotSupportedException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/AuthenticationNotSupportedException.html"));
		urls.put("javax.naming.CannotProceedException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/CannotProceedException.html"));
		urls.put("javax.naming.CommunicationException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/CommunicationException.html"));
		urls.put("javax.naming.ConfigurationException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/ConfigurationException.html"));
		urls.put("javax.naming.ContextNotEmptyException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/ContextNotEmptyException.html"));
		urls.put("javax.naming.InsufficientResourcesException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/InsufficientResourcesException.html"));
		urls.put("javax.naming.InterruptedNamingException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/InterruptedNamingException.html"));
		urls.put("javax.naming.InvalidNameException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/InvalidNameException.html"));
		urls.put("javax.naming.LimitExceededException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/LimitExceededException.html"));
		urls.put("javax.naming.LinkException", JAVA11_DOMAIN.concat("java.naming/javax/naming/LinkException.html"));
		urls.put("javax.naming.LinkLoopException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/LinkLoopException.html"));
		urls.put("javax.naming.MalformedLinkException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/MalformedLinkException.html"));
		urls.put("javax.naming.NameAlreadyBoundException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/NameAlreadyBoundException.html"));
		urls.put("javax.naming.NameNotFoundException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/NameNotFoundException.html"));
		urls.put("javax.naming.NamingException", JAVA11_DOMAIN.concat("java.naming/javax/naming/NamingException.html"));
		urls.put("javax.naming.NamingSecurityException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/NamingSecurityException.html"));
		urls.put("javax.naming.NoInitialContextException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/NoInitialContextException.html"));
		urls.put("javax.naming.NoPermissionException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/NoPermissionException.html"));
		urls.put("javax.naming.NotContextException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/NotContextException.html"));
		urls.put("javax.naming.OperationNotSupportedException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/OperationNotSupportedException.html"));
		urls.put("javax.naming.PartialResultException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/PartialResultException.html"));
		urls.put("javax.naming.ReferralException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/ReferralException.html"));
		urls.put("javax.naming.ServiceUnavailableException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/ServiceUnavailableException.html"));
		urls.put("javax.naming.SizeLimitExceededException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/SizeLimitExceededException.html"));
		urls.put("javax.naming.TimeLimitExceededException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/TimeLimitExceededException.html"));
		urls.put("javax.naming.directory.AttributeInUseException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/AttributeInUseException.html"));
		urls.put("javax.naming.directory.AttributeModificationException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/AttributeModificationException.html"));
		urls.put("javax.naming.directory.InvalidAttributeIdentifierException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/InvalidAttributeIdentifierException.html"));
		urls.put("javax.naming.directory.InvalidAttributeValueException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/InvalidAttributeValueException.html"));
		urls.put("javax.naming.directory.InvalidAttributesException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/InvalidAttributesException.html"));
		urls.put("javax.naming.directory.InvalidSearchControlsException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/InvalidSearchControlsException.html"));
		urls.put("javax.naming.directory.InvalidSearchFilterException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/InvalidSearchFilterException.html"));
		urls.put("javax.naming.directory.NoSuchAttributeException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/NoSuchAttributeException.html"));
		urls.put("javax.naming.directory.SchemaViolationException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/SchemaViolationException.html"));
//					urls.put("javax.naming.event.NamingExceptionEvent", DOMAIN.concat("java.naming/javax/naming/event/NamingExceptionEvent.html"));
		urls.put("javax.naming.ldap.LdapReferralException",
				JAVA11_DOMAIN.concat("java.naming/javax/naming/ldap/LdapReferralException.html"));
		urls.put("java.net.http.HttpConnectTimeoutException",
				JAVA11_DOMAIN.concat("java.net.http/java/net/http/HttpConnectTimeoutException.html"));
		urls.put("java.net.http.HttpTimeoutException",
				JAVA11_DOMAIN.concat("java.net.http/java/net/http/HttpTimeoutException.html"));
		urls.put("java.net.http.WebSocketHandshakeException",
				JAVA11_DOMAIN.concat("java.net.http/java/net/http/WebSocketHandshakeException.html"));
		urls.put("java.util.prefs.BackingStoreException",
				JAVA11_DOMAIN.concat("java.prefs/java/util/prefs/BackingStoreException.html"));
		urls.put("java.util.prefs.InvalidPreferencesFormatException",
				JAVA11_DOMAIN.concat("java.prefs/java/util/prefs/InvalidPreferencesFormatException.html"));
		urls.put("java.rmi.AccessException", JAVA11_DOMAIN.concat("java.rmi/java/rmi/AccessException.html"));
		urls.put("java.rmi.AlreadyBoundException",
				JAVA11_DOMAIN.concat("java.rmi/java/rmi/AlreadyBoundException.html"));
		urls.put("java.rmi.ConnectException", JAVA11_DOMAIN.concat("java.rmi/java/rmi/ConnectException.html"));
		urls.put("java.rmi.ConnectIOException", JAVA11_DOMAIN.concat("java.rmi/java/rmi/ConnectIOException.html"));
		urls.put("java.rmi.MarshalException", JAVA11_DOMAIN.concat("java.rmi/java/rmi/MarshalException.html"));
		urls.put("java.rmi.NoSuchObjectException",
				JAVA11_DOMAIN.concat("java.rmi/java/rmi/NoSuchObjectException.html"));
		urls.put("java.rmi.NotBoundException", JAVA11_DOMAIN.concat("java.rmi/java/rmi/NotBoundException.html"));
//					urls.put("java.rmi.RMISecurityException", DOMAIN.concat("java.rmi/java/rmi/RMISecurityException.html"));
		urls.put("java.rmi.RemoteException", JAVA11_DOMAIN.concat("java.rmi/java/rmi/RemoteException.html"));
		urls.put("java.rmi.ServerException", JAVA11_DOMAIN.concat("java.rmi/java/rmi/ServerException.html"));
//					urls.put("java.rmi.ServerRuntimeException", DOMAIN.concat("java.rmi/java/rmi/ServerRuntimeException.html"));
		urls.put("java.rmi.StubNotFoundException",
				JAVA11_DOMAIN.concat("java.rmi/java/rmi/StubNotFoundException.html"));
		urls.put("java.rmi.UnexpectedException", JAVA11_DOMAIN.concat("java.rmi/java/rmi/UnexpectedException.html"));
		urls.put("java.rmi.UnknownHostException", JAVA11_DOMAIN.concat("java.rmi/java/rmi/UnknownHostException.html"));
		urls.put("java.rmi.UnmarshalException", JAVA11_DOMAIN.concat("java.rmi/java/rmi/UnmarshalException.html"));
		urls.put("java.rmi.server.ExportException",
				JAVA11_DOMAIN.concat("java.rmi/java/rmi/server/ExportException.html"));
		urls.put("java.rmi.server.ServerCloneException",
				JAVA11_DOMAIN.concat("java.rmi/java/rmi/server/ServerCloneException.html"));
		urls.put("java.rmi.server.ServerNotActiveException",
				JAVA11_DOMAIN.concat("java.rmi/java/rmi/server/ServerNotActiveException.html"));
//					urls.put("java.rmi.server.SkeletonMismatchException", DOMAIN.concat("java.rmi/java/rmi/server/SkeletonMismatchException.html"));
//					urls.put("java.rmi.server.SkeletonNotFoundException", DOMAIN.concat("java.rmi/java/rmi/server/SkeletonNotFoundException.html"));
//					urls.put("java.rmi.server.SocketSecurityException", DOMAIN.concat("java.rmi/java/rmi/server/SocketSecurityException.html"));
		urls.put("javax.script.ScriptException",
				JAVA11_DOMAIN.concat("java.scripting/javax/script/ScriptException.html"));
		urls.put("org.ietf.jgss.GSSException",
				JAVA11_DOMAIN.concat("java.security.jgss/org/ietf/jgss/GSSException.html"));
		urls.put("javax.security.sasl.AuthenticationException",
				JAVA11_DOMAIN.concat("java.security.sasl/javax/security/sasl/AuthenticationException.html"));
		urls.put("javax.security.sasl.SaslException",
				JAVA11_DOMAIN.concat("java.security.sasl/javax/security/sasl/SaslException.html"));
//					urls.put("javax.smartcardio.CardException", DOMAIN.concat("java.smartcardio/javax/smartcardio/CardException.html"));
//					urls.put("javax.smartcardio.CardNotPresentException", DOMAIN.concat("java.smartcardio/javax/smartcardio/CardNotPresentException.html"));
		urls.put("javax.sql.rowset.serial.SerialException",
				JAVA11_DOMAIN.concat("java.sql.rowset/javax/sql/rowset/serial/SerialException.html"));
		urls.put("javax.sql.rowset.spi.SyncFactoryException",
				JAVA11_DOMAIN.concat("java.sql.rowset/javax/sql/rowset/spi/SyncFactoryException.html"));
		urls.put("javax.sql.rowset.spi.SyncProviderException",
				JAVA11_DOMAIN.concat("java.sql.rowset/javax/sql/rowset/spi/SyncProviderException.html"));
		urls.put("java.sql.BatchUpdateException", JAVA11_DOMAIN.concat("java.sql/java/sql/BatchUpdateException.html"));
		urls.put("java.sql.SQLClientInfoException",
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLClientInfoException.html"));
		urls.put("java.sql.SQLDataException", JAVA11_DOMAIN.concat("java.sql/java/sql/SQLDataException.html"));
		urls.put("java.sql.SQLException", JAVA11_DOMAIN.concat("java.sql/java/sql/SQLException.html"));
		urls.put("java.sql.SQLFeatureNotSupportedException",
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLFeatureNotSupportedException.html"));
		urls.put("java.sql.SQLIntegrityConstraintViolationException",
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLIntegrityConstraintViolationException.html"));
		urls.put("java.sql.SQLInvalidAuthorizationSpecException",
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLInvalidAuthorizationSpecException.html"));
		urls.put("java.sql.SQLNonTransientConnectionException",
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLNonTransientConnectionException.html"));
		urls.put("java.sql.SQLNonTransientException",
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLNonTransientException.html"));
		urls.put("java.sql.SQLRecoverableException",
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLRecoverableException.html"));
		urls.put("java.sql.SQLSyntaxErrorException",
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLSyntaxErrorException.html"));
		urls.put("java.sql.SQLTimeoutException", JAVA11_DOMAIN.concat("java.sql/java/sql/SQLTimeoutException.html"));
		urls.put("java.sql.SQLTransactionRollbackException",
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLTransactionRollbackException.html"));
		urls.put("java.sql.SQLTransientConnectionException",
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLTransientConnectionException.html"));
		urls.put("java.sql.SQLTransientException",
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLTransientException.html"));
//		urls.put("javax.transaction.xa.XAException", DOMAIN.concat("java.transaction.xa/javax/transaction/xa/XAException.html"));
		urls.put("javax.xml.crypto.KeySelectorException",
				JAVA11_DOMAIN.concat("java.xml.crypto/javax/xml/crypto/KeySelectorException.html"));
		urls.put("javax.xml.crypto.MarshalException",
				JAVA11_DOMAIN.concat("java.xml.crypto/javax/xml/crypto/MarshalException.html"));
		urls.put("javax.xml.crypto.NoSuchMechanismException",
				JAVA11_DOMAIN.concat("java.xml.crypto/javax/xml/crypto/NoSuchMechanismException.html"));
		urls.put("javax.xml.crypto.URIReferenceException",
				JAVA11_DOMAIN.concat("java.xml.crypto/javax/xml/crypto/URIReferenceException.html"));
		urls.put("javax.xml.crypto.dsig.TransformException",
				JAVA11_DOMAIN.concat("java.xml.crypto/javax/xml/crypto/dsig/TransformException.html"));
		urls.put("javax.xml.crypto.dsig.XMLSignatureException",
				JAVA11_DOMAIN.concat("java.xml.crypto/javax/xml/crypto/dsig/XMLSignatureException.html"));
		urls.put("javax.xml.catalog.CatalogException",
				JAVA11_DOMAIN.concat("java.xml/javax/xml/catalog/CatalogException.html"));
		urls.put("javax.xml.datatype.DatatypeConfigurationException",
				JAVA11_DOMAIN.concat("java.xml/javax/xml/datatype/DatatypeConfigurationException.html"));
		urls.put("javax.xml.parsers.ParserConfigurationException",
				JAVA11_DOMAIN.concat("java.xml/javax/xml/parsers/ParserConfigurationException.html"));
		urls.put("javax.xml.stream.XMLStreamException",
				JAVA11_DOMAIN.concat("java.xml/javax/xml/stream/XMLStreamException.html"));
		urls.put("javax.xml.transform.TransformerConfigurationException",
				JAVA11_DOMAIN.concat("java.xml/javax/xml/transform/TransformerConfigurationException.html"));
		urls.put("javax.xml.transform.TransformerException",
				JAVA11_DOMAIN.concat("java.xml/javax/xml/transform/TransformerException.html"));
		urls.put("javax.xml.xpath.XPathException",
				JAVA11_DOMAIN.concat("java.xml/javax/xml/xpath/XPathException.html"));
		urls.put("javax.xml.xpath.XPathExpressionException",
				JAVA11_DOMAIN.concat("java.xml/javax/xml/xpath/XPathExpressionException.html"));
		urls.put("javax.xml.xpath.XPathFactoryConfigurationException",
				JAVA11_DOMAIN.concat("java.xml/javax/xml/xpath/XPathFactoryConfigurationException.html"));
		urls.put("javax.xml.xpath.XPathFunctionException",
				JAVA11_DOMAIN.concat("java.xml/javax/xml/xpath/XPathFunctionException.html"));
		urls.put("org.w3c.dom.DOMException", JAVA11_DOMAIN.concat("java.xml/org/w3c/dom/DOMException.html"));
		urls.put("org.w3c.dom.events.EventException",
				JAVA11_DOMAIN.concat("java.xml/org/w3c/dom/events/EventException.html"));
		urls.put("org.w3c.dom.ls.LSException", JAVA11_DOMAIN.concat("java.xml/org/w3c/dom/ls/LSException.html"));
		urls.put("org.w3c.dom.ranges.RangeException",
				JAVA11_DOMAIN.concat("java.xml/org/w3c/dom/ranges/RangeException.html"));
		urls.put("org.xml.sax.SAXException", JAVA11_DOMAIN.concat("java.xml/org/xml/sax/SAXException.html"));
		urls.put("org.xml.sax.SAXNotRecognizedException",
				JAVA11_DOMAIN.concat("java.xml/org/xml/sax/SAXNotRecognizedException.html"));
		urls.put("org.xml.sax.SAXNotSupportedException",
				JAVA11_DOMAIN.concat("java.xml/org/xml/sax/SAXNotSupportedException.html"));
		urls.put("org.xml.sax.SAXParseException", JAVA11_DOMAIN.concat("java.xml/org/xml/sax/SAXParseException.html"));

		urls.putAll(fillAEMHash());
		return urls;
	}

	/**
	 * fillAEMHash
	 * 
	 * @return hashMap with AEM urls api docs
	 */
	private static final HashMap<String, String> fillAEMHash() {
		HashMap<String, String> urls = new HashMap<>();

		urls.put("com.adobe.aem.formsndocuments.exception.FormsNDocumentsException",
				AEM_DOMAIN.concat("com/adobe/aem/formsndocuments/exception/FormsNDocumentsException.html"));
		urls.put("com.adobe.aem.transaction.core.exception.TransactionException",
				AEM_DOMAIN.concat("com/adobe/aem/transaction/core/exception/TransactionException.html"));
		urls.put("com.adobe.aemds.guide.common.FormsGuideException",
				AEM_DOMAIN.concat("com/adobe/aemds/guide/common/FormsGuideException.html"));
		urls.put("com.adobe.aemds.guide.service.GuideException",
				AEM_DOMAIN.concat("com/adobe/aemds/guide/service/GuideException.html"));
		urls.put("com.adobe.aemforms.fm.exception.FormsMgrException",
				AEM_DOMAIN.concat("com/adobe/aemforms/fm/exception/FormsMgrException.html"));

		urls.put("com.adobe.cq.adobeims.imsprofile.ImsProfileException",
				AEM_DOMAIN.concat("com/adobe/cq/adobeims/imsprofile/ImsProfileException.html"));
		urls.put("com.adobe.cq.adobeims.imsprofile.InvalidImsConfigException",
				AEM_DOMAIN.concat("com/adobe/cq/adobeims/imsprofile/InvalidImsConfigException.html"));
		urls.put("com.adobe.cq.cloudservices.provisioning.ProvisioningException",
				AEM_DOMAIN.concat("com/adobe/cq/cloudservices/provisioning/ProvisioningException.html"));
		urls.put("com.adobe.cq.commerce.api.CommerceException",
				AEM_DOMAIN.concat("com/adobe/cq/commerce/api/CommerceException.html"));
		urls.put("com.adobe.cq.commerce.api.NotAuthorizedException",
				AEM_DOMAIN.concat("com/adobe/cq/commerce/api/NotAuthorizedException.html"));
		urls.put("com.adobe.cq.dam.cfm.ContentFragmentException",
				AEM_DOMAIN.concat("com/adobe/cq/dam/cfm/ContentFragmentException.html"));
		urls.put("com.adobe.cq.dashboards.DashboardException",
				AEM_DOMAIN.concat("com/adobe/cq/dashboards/DashboardException.html"));
		urls.put("com.adobe.cq.inbox.api.InboxException",
				AEM_DOMAIN.concat("com/adobe/cq/inbox/api/InboxException.html"));
		urls.put("com.adobe.cq.launches.api.LaunchException",
				AEM_DOMAIN.concat("com/adobe/cq/launches/api/LaunchException.html"));
		urls.put("com.adobe.cq.mcm.campaign.NewsletterException",
				AEM_DOMAIN.concat("com/adobe/cq/mcm/campaign/NewsletterException.html"));
		urls.put("com.adobe.cq.mcm.campaign.NewsletterReplicationException",
				AEM_DOMAIN.concat("com/adobe/cq/mcm/campaign/NewsletterReplicationException.html"));
		urls.put("com.adobe.cq.projects.api.ProjectException",
				AEM_DOMAIN.concat("com/adobe/cq/projects/api/ProjectException.html"));
		urls.put("com.adobe.cq.remote.content.renderer.RemoteContentRenderingException",
				AEM_DOMAIN.concat("com/adobe/cq/remote/content/renderer/RemoteContentRenderingException.html"));
		urls.put("com.adobe.cq.scheduled.exporter.ExportException",
				AEM_DOMAIN.concat("com/adobe/cq/scheduled/exporter/ExportException.html"));
		urls.put("com.adobe.cq.scheduled.exporter.TransformationException",
				AEM_DOMAIN.concat("com/adobe/cq/scheduled/exporter/TransformationException.html"));
		urls.put("com.adobe.cq.smartcontent.SmartContentException",
				AEM_DOMAIN.concat("com/adobe/cq/smartcontent/SmartContentException.html"));
		urls.put("com.adobe.cq.social.SocialException", AEM_DOMAIN.concat("com/adobe/cq/social/SocialException.html"));
		urls.put("com.adobe.cq.social.commons.emailreply.EmailReplyException",
				AEM_DOMAIN.concat("com/adobe/cq/social/commons/emailreply/EmailReplyException.html"));
		urls.put("com.adobe.cq.social.commons.listing.QueryFilterUtil.QueryFilterException",
				AEM_DOMAIN.concat("com/adobe/cq/social/commons/listing/QueryFilterUtil.QueryFilterException.html"));
		urls.put("com.adobe.cq.social.group.api.GroupConfigurator.GroupConfigurationException",
				AEM_DOMAIN.concat("com/adobe/cq/social/group/api/GroupConfigurator.GroupConfigurationException.html"));
		urls.put("com.adobe.cq.social.group.api.GroupException",
				AEM_DOMAIN.concat("com/adobe/cq/social/group/api/GroupException.html"));
		urls.put("com.adobe.cq.social.messaging.api.MessageBoxOverflowException",
				AEM_DOMAIN.concat("com/adobe/cq/social/messaging/api/MessageBoxOverflowException.html"));
		urls.put("com.adobe.cq.social.messaging.api.MessageException",
				AEM_DOMAIN.concat("com/adobe/cq/social/messaging/api/MessageException.html"));
		urls.put("com.adobe.cq.social.messaging.api.MessageSendException",
				AEM_DOMAIN.concat("com/adobe/cq/social/messaging/api/MessageSendException.html"));
		urls.put("com.adobe.cq.social.notifications.channel.ChannelException",
				AEM_DOMAIN.concat("com/adobe/cq/social/notifications/channel/ChannelException.html"));
		urls.put("com.adobe.cq.social.review.client.api.ReviewException",
				AEM_DOMAIN.concat("com/adobe/cq/social/review/client/api/ReviewException.html"));
		urls.put("com.adobe.cq.social.scf.JsonException",
				AEM_DOMAIN.concat("com/adobe/cq/social/scf/JsonException.html"));
		urls.put("com.adobe.cq.social.scf.OperationException",
				AEM_DOMAIN.concat("com/adobe/cq/social/scf/OperationException.html"));
		urls.put("com.adobe.cq.social.srp.APIException",
				AEM_DOMAIN.concat("com/adobe/cq/social/srp/APIException.html"));
		urls.put("com.adobe.cq.social.tally.TallyBadRequestException",
				AEM_DOMAIN.concat("com/adobe/cq/social/tally/TallyBadRequestException.html"));
		urls.put("com.adobe.cq.social.tally.client.api.TallyException",
				AEM_DOMAIN.concat("com/adobe/cq/social/tally/client/api/TallyException.html"));
		urls.put("com.adobe.cq.social.ugcbase.moderation.AutoModerationProcessException",
				AEM_DOMAIN.concat("com/adobe/cq/social/ugcbase/moderation/AutoModerationProcessException.html"));
		urls.put("com.adobe.cq.targetrecommendations.api.TargetRecommendationsException",
				AEM_DOMAIN.concat("com/adobe/cq/targetrecommendations/api/TargetRecommendationsException.html"));
		urls.put("com.adobe.dam.print.ids.IDSException",
				AEM_DOMAIN.concat("com/adobe/dam/print/ids/IDSException.html"));
		urls.put("com.adobe.fd.fp.exception.FormsPortalException",
				AEM_DOMAIN.concat("com/adobe/fd/fp/exception/FormsPortalException.html"));
		urls.put("com.adobe.fd.fp.exception.FormsPortalRepositoryException",
				AEM_DOMAIN.concat("com/adobe/fd/fp/exception/FormsPortalRepositoryException.html"));
		urls.put("com.adobe.forms.common.service.FormsException",
				AEM_DOMAIN.concat("com/adobe/forms/common/service/FormsException.html"));
		urls.put("com.adobe.forms.foundation.service.FormsFoundationException",
				AEM_DOMAIN.concat("com/adobe/forms/foundation/service/FormsFoundationException.html"));
		urls.put("com.adobe.granite.activitystreams.ActivityException",
				AEM_DOMAIN.concat("com/adobe/granite/activitystreams/ActivityException.html"));
		urls.put("com.adobe.granite.asset.api.AssetException",
				AEM_DOMAIN.concat("com/adobe/granite/asset/api/AssetException.html"));
		urls.put("com.adobe.granite.asset.api.AssetIOException",
				AEM_DOMAIN.concat("com/adobe/granite/asset/api/AssetIOException.html"));
		urls.put("com.adobe.granite.auth.cert.UserCertificateMappingException",
				AEM_DOMAIN.concat("com/adobe/granite/auth/cert/UserCertificateMappingException.html"));
		urls.put("com.adobe.granite.auth.oauth.OAuthIdInUseException",
				AEM_DOMAIN.concat("com/adobe/granite/auth/oauth/OAuthIdInUseException.html"));
		urls.put("com.adobe.granite.comments.CommentException",
				AEM_DOMAIN.concat("com/adobe/granite/comments/CommentException.html"));
		urls.put("com.adobe.granite.crypto.CryptoException",
				AEM_DOMAIN.concat("com/adobe/granite/crypto/CryptoException.html"));
		urls.put("com.adobe.granite.keystore.KeyStoreNotInitialisedException",
				AEM_DOMAIN.concat("com/adobe/granite/keystore/KeyStoreNotInitialisedException.html"));

		urls.put("com.adobe.granite.omnisearch.api.core.OmniSearchException",
				AEM_DOMAIN.concat("com/adobe/granite/omnisearch/api/core/OmniSearchException.html"));
		urls.put("com.adobe.granite.rest.RequestException",
				AEM_DOMAIN.concat("com/adobe/granite/rest/RequestException.html"));
		urls.put("com.adobe.granite.rest.RestException",
				AEM_DOMAIN.concat("com/adobe/granite/rest/RestException.html"));
		urls.put("com.adobe.granite.rest.converter.ResourceConverterException",
				AEM_DOMAIN.concat("com/adobe/granite/rest/converter/ResourceConverterException.html"));
		urls.put("com.adobe.granite.socialgraph.SocialGraphException",
				AEM_DOMAIN.concat("com/adobe/granite/socialgraph/SocialGraphException.html"));
		urls.put("com.adobe.granite.taskmanagement.TaskManagerException",
				AEM_DOMAIN.concat("com/adobe/granite/taskmanagement/TaskManagerException.html"));
		urls.put("com.adobe.granite.taskmanagement.TaskNotFoundException",
				AEM_DOMAIN.concat("com/adobe/granite/taskmanagement/TaskNotFoundException.html"));
		urls.put("com.adobe.granite.taskmanagement.TaskSecurityException",
				AEM_DOMAIN.concat("com/adobe/granite/taskmanagement/TaskSecurityException.html"));
		urls.put("com.adobe.granite.translation.api.TranslationException",
				AEM_DOMAIN.concat("com/adobe/granite/translation/api/TranslationException.html"));
		urls.put("com.adobe.granite.translation.api.xliff.TranslationXLIFFServiceException",
				AEM_DOMAIN.concat("com/adobe/granite/translation/api/xliff/TranslationXLIFFServiceException.html"));
		urls.put("com.adobe.granite.workflow.WorkflowException",
				AEM_DOMAIN.concat("com/adobe/granite/workflow/WorkflowException.html"));
		urls.put("com.adobe.granite.workflow.model.ValidationException",
				AEM_DOMAIN.concat("com/adobe/granite/workflow/model/ValidationException.html"));
		urls.put("com.adobe.granite.workflow.model.VersionException",
				AEM_DOMAIN.concat("com/adobe/granite/workflow/model/VersionException.html"));
		urls.put("com.adobe.internal.xmp.XMPException", AEM_DOMAIN.concat("com/adobe/internal/xmp/XMPException.html"));
		urls.put("com.adobe.reef.siren.SirenException", AEM_DOMAIN.concat("com/adobe/reef/siren/SirenException.html"));
		urls.put("com.adobe.reef.siren.builder.BuilderException",
				AEM_DOMAIN.concat("com/adobe/reef/siren/builder/BuilderException.html"));
		urls.put("com.adobe.reef.siren.builder.BuilderValidationException",
				AEM_DOMAIN.concat("com/adobe/reef/siren/builder/BuilderValidationException.html"));
		urls.put("com.adobe.reef.siren.converter.ConverterException",
				AEM_DOMAIN.concat("com/adobe/reef/siren/converter/ConverterException.html"));
		urls.put("com.adobe.versioncue.nativecomm.BadConfigException",
				AEM_DOMAIN.concat("com/adobe/versioncue/nativecomm/BadConfigException.html"));
		urls.put("com.adobe.versioncue.nativecomm.NativeCommException",
				AEM_DOMAIN.concat("com/adobe/versioncue/nativecomm/NativeCommException.html"));
		urls.put("com.adobe.versioncue.nativecomm.ServiceAbortException",
				AEM_DOMAIN.concat("com/adobe/versioncue/nativecomm/ServiceAbortException.html"));
		urls.put("com.adobe.versioncue.nativecomm.ServiceCallException",
				AEM_DOMAIN.concat("com/adobe/versioncue/nativecomm/ServiceCallException.html"));
		urls.put("com.adobe.versioncue.nativecomm.ServiceTimeoutException",
				AEM_DOMAIN.concat("com/adobe/versioncue/nativecomm/ServiceTimeoutException.html"));
		urls.put("com.adobe.versioncue.nativecomm.msg.BadMessageException",
				AEM_DOMAIN.concat("com/adobe/versioncue/nativecomm/msg/BadMessageException.html"));
		urls.put("com.adobe.xmp.XMPException", AEM_DOMAIN.concat("com/adobe/xmp/XMPException.html"));
		urls.put("com.adobe.xmp.core.XMPException", AEM_DOMAIN.concat("com/adobe/xmp/core/XMPException.html"));
		urls.put("com.adobe.xmp.core.parser.ParseRDFException",
				AEM_DOMAIN.concat("com/adobe/xmp/core/parser/ParseRDFException.html"));
		urls.put("com.adobe.xmp.core.parser.ParseXMLException",
				AEM_DOMAIN.concat("com/adobe/xmp/core/parser/ParseXMLException.html"));
		urls.put("com.adobe.xmp.core.parser.ParseXMPException",
				AEM_DOMAIN.concat("com/adobe/xmp/core/parser/ParseXMPException.html"));
		urls.put("com.adobe.xmp.core.serializer.SerializeOptionsException",
				AEM_DOMAIN.concat("com/adobe/xmp/core/serializer/SerializeOptionsException.html"));
		urls.put("com.adobe.xmp.core.serializer.SerializeXMPException",
				AEM_DOMAIN.concat("com/adobe/xmp/core/serializer/SerializeXMPException.html"));
		urls.put("com.adobe.xmp.path.XMPPathParserException",
				AEM_DOMAIN.concat("com/adobe/xmp/path/XMPPathParserException.html"));
		urls.put("com.adobe.xmp.schema.model.XMPSchemaException",
				AEM_DOMAIN.concat("com/adobe/xmp/schema/model/XMPSchemaException.html"));
		urls.put("com.adobe.xmp.schema.rng.parser.exceptions.RNGElementNotSupportedException",
				AEM_DOMAIN.concat("com/adobe/xmp/schema/rng/parser/exceptions/RNGElementNotSupportedException.html"));
		urls.put("com.adobe.xmp.schema.rng.parser.exceptions.RNGInvalidSchemaException",
				AEM_DOMAIN.concat("com/adobe/xmp/schema/rng/parser/exceptions/RNGInvalidSchemaException.html"));
		urls.put("com.adobe.xmp.schema.rng.parser.exceptions.RNGParseException",
				AEM_DOMAIN.concat("com/adobe/xmp/schema/rng/parser/exceptions/RNGParseException.html"));
		urls.put("com.adobe.xmp.schema.rng.parser.exceptions.RNGUnexpectedElementFoundException", AEM_DOMAIN
				.concat("com/adobe/xmp/schema/rng/parser/exceptions/RNGUnexpectedElementFoundException.html"));
		urls.put("com.adobe.xmp.schema.service.SchemaServiceException",
				AEM_DOMAIN.concat("com/adobe/xmp/schema/service/SchemaServiceException.html"));
		urls.put("com.day.commons.datasource.poolservice.DataSourceNotFoundException",
				AEM_DOMAIN.concat("com/day/commons/datasource/poolservice/DataSourceNotFoundException.html"));
		urls.put("com.day.commons.datasource.poolservice.TypeNotAvailableException",
				AEM_DOMAIN.concat("com/day/commons/datasource/poolservice/TypeNotAvailableException.html"));
		urls.put("com.day.cq.analytics.sitecatalyst.SitecatalystException",
				AEM_DOMAIN.concat("com/day/cq/analytics/sitecatalyst/SitecatalystException.html"));
		urls.put("com.day.cq.analytics.testandtarget.TestandtargetException",
				AEM_DOMAIN.concat("com/day/cq/analytics/testandtarget/TestandtargetException.html"));
		urls.put("com.day.cq.analytics.testandtarget.TestandtargetFormattedException",
				AEM_DOMAIN.concat("com/day/cq/analytics/testandtarget/TestandtargetFormattedException.html"));
		urls.put("com.day.cq.analytics.testandtarget.TestandtargetUnsupportedApiOperationException", AEM_DOMAIN
				.concat("com/day/cq/analytics/testandtarget/TestandtargetUnsupportedApiOperationException.html"));
		urls.put("com.day.cq.analytics.testandtarget.workspaces.WorkspacesConfigurationException", AEM_DOMAIN
				.concat("com/day/cq/analytics/testandtarget/workspaces/WorkspacesConfigurationException.html"));
		urls.put("com.day.cq.analytics.testandtarget.workspaces.WorkspacesProviderException",
				AEM_DOMAIN.concat("com/day/cq/analytics/testandtarget/workspaces/WorkspacesProviderException.html"));
		urls.put("com.day.cq.commons.SlingRepositoryException",
				AEM_DOMAIN.concat("com/day/cq/commons/SlingRepositoryException.html"));
		urls.put("com.day.cq.commons.date.InvalidDateException",
				AEM_DOMAIN.concat("com/day/cq/commons/date/InvalidDateException.html"));
		urls.put("com.day.cq.dam.api.AssetHandlerException",
				AEM_DOMAIN.concat("com/day/cq/dam/api/AssetHandlerException.html"));
		urls.put("com.day.cq.dam.api.FolderSettingsException",
				AEM_DOMAIN.concat("com/day/cq/dam/api/FolderSettingsException.html"));
		urls.put("com.day.cq.dam.api.ProcessorException",
				AEM_DOMAIN.concat("com/day/cq/dam/api/ProcessorException.html"));
		urls.put("com.day.cq.dam.commons.watermark.WatermarkingException",
				AEM_DOMAIN.concat("com/day/cq/dam/commons/watermark/WatermarkingException.html"));
		urls.put("com.day.cq.dam.handler.ffmpeg.FfmpegNotFoundException",
				AEM_DOMAIN.concat("com/day/cq/dam/handler/ffmpeg/FfmpegNotFoundException.html"));
		urls.put("com.day.cq.dam.handler.gibson.fontmanager.FontManagerException",
				AEM_DOMAIN.concat("com/day/cq/dam/handler/gibson/fontmanager/FontManagerException.html"));
		urls.put("com.day.cq.dam.indd.PageExtractionException",
				AEM_DOMAIN.concat("com/day/cq/dam/indd/PageExtractionException.html"));
		urls.put("com.day.cq.dam.scene7.api.model.AuthenticationException",
				AEM_DOMAIN.concat("com/day/cq/dam/scene7/api/model/AuthenticationException.html"));
		urls.put("com.day.cq.dam.scene7.api.model.AuthorizationException",
				AEM_DOMAIN.concat("com/day/cq/dam/scene7/api/model/AuthorizationException.html"));
		urls.put("com.day.cq.dam.scene7.api.model.IpsApiException",
				AEM_DOMAIN.concat("com/day/cq/dam/scene7/api/model/IpsApiException.html"));
		urls.put("com.day.cq.mailer.MailingException", AEM_DOMAIN.concat("com/day/cq/mailer/MailingException.html"));
		urls.put("com.day.cq.mcm.campaign.ACConnectorException",
				AEM_DOMAIN.concat("com/day/cq/mcm/campaign/ACConnectorException.html"));
		urls.put("com.day.cq.mcm.campaign.CampaignException",
				AEM_DOMAIN.concat("com/day/cq/mcm/campaign/CampaignException.html"));
		urls.put("com.day.cq.mcm.campaign.ConfigurationException",
				AEM_DOMAIN.concat("com/day/cq/mcm/campaign/ConfigurationException.html"));
		urls.put("com.day.cq.mcm.campaign.ConnectionException",
				AEM_DOMAIN.concat("com/day/cq/mcm/campaign/ConnectionException.html"));
		urls.put("com.day.cq.mcm.emailprovider.EmailServiceException",
				AEM_DOMAIN.concat("com/day/cq/mcm/emailprovider/EmailServiceException.html"));
		urls.put("com.day.cq.notification.api.ChannelException",
				AEM_DOMAIN.concat("com/day/cq/notification/api/ChannelException.html"));
		urls.put("com.day.cq.notification.api.NotificationException",
				AEM_DOMAIN.concat("com/day/cq/notification/api/NotificationException.html"));
		urls.put("com.day.cq.polling.importer.ImportException",
				AEM_DOMAIN.concat("com/day/cq/polling/importer/ImportException.html"));
		urls.put("com.day.cq.replication.AccessDeniedException",
				AEM_DOMAIN.concat("com/day/cq/replication/AccessDeniedException.html"));
		urls.put("com.day.cq.replication.AgentNotFoundException",
				AEM_DOMAIN.concat("com/day/cq/replication/AgentNotFoundException.html"));
		urls.put("com.day.cq.replication.PathNotFoundException",
				AEM_DOMAIN.concat("com/day/cq/replication/PathNotFoundException.html"));
		urls.put("com.day.cq.replication.ReplicationException",
				AEM_DOMAIN.concat("com/day/cq/replication/ReplicationException.html"));
		urls.put("com.day.cq.replication.TransportException",
				AEM_DOMAIN.concat("com/day/cq/replication/TransportException.html"));
		urls.put("com.day.cq.replication.UnrecoverableReplicationException",
				AEM_DOMAIN.concat("com/day/cq/replication/UnrecoverableReplicationException.html"));

		urls.put("com.day.cq.spellchecker.SpellCheckException",
				AEM_DOMAIN.concat("com/day/cq/spellchecker/SpellCheckException.html"));
		urls.put("com.day.cq.tagging.InvalidTagFormatException",
				AEM_DOMAIN.concat("com/day/cq/tagging/InvalidTagFormatException.html"));
		urls.put("com.day.cq.tagging.TagException", AEM_DOMAIN.concat("com/day/cq/tagging/TagException.html"));
		urls.put("com.day.cq.wcm.api.WCMException", AEM_DOMAIN.concat("com/day/cq/wcm/api/WCMException.html"));
		urls.put("com.day.cq.wcm.api.WCMRuntimeException",
				AEM_DOMAIN.concat("com/day/cq/wcm/api/WCMRuntimeException.html"));
		urls.put("com.day.cq.wcm.command.api.CommandException",
				AEM_DOMAIN.concat("com/day/cq/wcm/command/api/CommandException.html"));
		urls.put("com.day.cq.wcm.designimporter.DesignImportException",
				AEM_DOMAIN.concat("com/day/cq/wcm/designimporter/DesignImportException.html"));
		urls.put("com.day.cq.wcm.designimporter.MalformedArchiveException",
				AEM_DOMAIN.concat("com/day/cq/wcm/designimporter/MalformedArchiveException.html"));
		urls.put("com.day.cq.wcm.designimporter.MissingCanvasException",
				AEM_DOMAIN.concat("com/day/cq/wcm/designimporter/MissingCanvasException.html"));
		urls.put("com.day.cq.wcm.designimporter.MissingHTMLException",
				AEM_DOMAIN.concat("com/day/cq/wcm/designimporter/MissingHTMLException.html"));
		urls.put("com.day.cq.wcm.designimporter.UnsupportedTagContentException",
				AEM_DOMAIN.concat("com/day/cq/wcm/designimporter/UnsupportedTagContentException.html"));
		urls.put("com.day.cq.wcm.undo.BinaryHandlingException",
				AEM_DOMAIN.concat("com/day/cq/wcm/undo/BinaryHandlingException.html"));
		urls.put("com.day.cq.workflow.WorkflowException",
				AEM_DOMAIN.concat("com/day/cq/workflow/WorkflowException.html"));
		urls.put("com.day.cq.workflow.model.ValidationException",
				AEM_DOMAIN.concat("com/day/cq/workflow/model/ValidationException.html"));

		urls.put("com.day.crx.BaseException", AEM_DOMAIN.concat("com/day/crx/BaseException.html"));
		urls.put("com.day.util.WrappedException", AEM_DOMAIN.concat("com/day/util/WrappedException.html"));
		urls.put("com.day.util.WrappedRuntimeException",
				AEM_DOMAIN.concat("com/day/util/WrappedRuntimeException.html"));
		urls.put("com.fasterxml.jackson.core.JsonGenerationException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/core/JsonGenerationException.html"));
		urls.put("com.fasterxml.jackson.core.JsonParseException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/core/JsonParseException.html"));
		urls.put("com.fasterxml.jackson.core.JsonProcessingException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/core/JsonProcessingException.html"));
		urls.put("com.fasterxml.jackson.core.exc.InputCoercionException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/core/exc/InputCoercionException.html"));
		urls.put("com.fasterxml.jackson.core.exc.StreamReadException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/core/exc/StreamReadException.html"));
		urls.put("com.fasterxml.jackson.core.io.JsonEOFException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/core/io/JsonEOFException.html"));
		urls.put("com.fasterxml.jackson.databind.JsonMappingException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/JsonMappingException.html"));
		urls.put("com.fasterxml.jackson.databind.RuntimeJsonMappingException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/RuntimeJsonMappingException.html"));
		urls.put("com.fasterxml.jackson.databind.exc.IgnoredPropertyException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/IgnoredPropertyException.html"));
		urls.put("com.fasterxml.jackson.databind.exc.InvalidDefinitionException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/InvalidDefinitionException.html"));
		urls.put("com.fasterxml.jackson.databind.exc.InvalidFormatException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/InvalidFormatException.html"));
		urls.put("com.fasterxml.jackson.databind.exc.InvalidNullException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/InvalidNullException.html"));
		urls.put("com.fasterxml.jackson.databind.exc.InvalidTypeIdException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/InvalidTypeIdException.html"));
		urls.put("com.fasterxml.jackson.databind.exc.MismatchedInputException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/MismatchedInputException.html"));
		urls.put("com.fasterxml.jackson.databind.exc.PropertyBindingException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/PropertyBindingException.html"));
		urls.put("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/UnrecognizedPropertyException.html"));
		urls.put("com.fasterxml.jackson.databind.exc.ValueInstantiationException",
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/ValueInstantiationException.html"));
		urls.put("com.github.jknack.handlebars.HandlebarsException",
				AEM_DOMAIN.concat("com/github/jknack/handlebars/HandlebarsException.html"));
		urls.put("com.google.gson.JsonIOException", AEM_DOMAIN.concat("com/google/gson/JsonIOException.html"));
		urls.put("com.google.gson.JsonParseException", AEM_DOMAIN.concat("com/google/gson/JsonParseException.html"));
		urls.put("com.google.gson.JsonSyntaxException", AEM_DOMAIN.concat("com/google/gson/JsonSyntaxException.html"));
		urls.put("com.google.gson.stream.MalformedJsonException",
				AEM_DOMAIN.concat("com/google/gson/stream/MalformedJsonException.html"));

		urls.put("com.sun.mail.iap.BadCommandException",
				AEM_DOMAIN.concat("com/sun/mail/iap/BadCommandException.html"));
		urls.put("com.sun.mail.iap.CommandFailedException",
				AEM_DOMAIN.concat("com/sun/mail/iap/CommandFailedException.html"));
		urls.put("com.sun.mail.iap.ConnectionException",
				AEM_DOMAIN.concat("com/sun/mail/iap/ConnectionException.html"));
		urls.put("com.sun.mail.iap.LiteralException", AEM_DOMAIN.concat("com/sun/mail/iap/LiteralException.html"));
		urls.put("com.sun.mail.iap.ParsingException", AEM_DOMAIN.concat("com/sun/mail/iap/ParsingException.html"));
		urls.put("com.sun.mail.iap.ProtocolException", AEM_DOMAIN.concat("com/sun/mail/iap/ProtocolException.html"));
		urls.put("com.sun.mail.imap.ReferralException", AEM_DOMAIN.concat("com/sun/mail/imap/ReferralException.html"));
		urls.put("com.sun.mail.imap.protocol.IMAPReferralException",
				AEM_DOMAIN.concat("com/sun/mail/imap/protocol/IMAPReferralException.html"));
		urls.put("com.sun.mail.smtp.SMTPAddressFailedException",
				AEM_DOMAIN.concat("com/sun/mail/smtp/SMTPAddressFailedException.html"));
		urls.put("com.sun.mail.smtp.SMTPAddressSucceededException",
				AEM_DOMAIN.concat("com/sun/mail/smtp/SMTPAddressSucceededException.html"));
		urls.put("com.sun.mail.smtp.SMTPSendFailedException",
				AEM_DOMAIN.concat("com/sun/mail/smtp/SMTPSendFailedException.html"));
		urls.put("com.sun.mail.smtp.SMTPSenderFailedException",
				AEM_DOMAIN.concat("com/sun/mail/smtp/SMTPSenderFailedException.html"));
		urls.put("com.sun.mail.util.DecodingException", AEM_DOMAIN.concat("com/sun/mail/util/DecodingException.html"));
		urls.put("com.sun.mail.util.FolderClosedIOException",
				AEM_DOMAIN.concat("com/sun/mail/util/FolderClosedIOException.html"));
		urls.put("com.sun.mail.util.MailConnectException",
				AEM_DOMAIN.concat("com/sun/mail/util/MailConnectException.html"));
		urls.put("com.sun.mail.util.MessageRemovedIOException",
				AEM_DOMAIN.concat("com/sun/mail/util/MessageRemovedIOException.html"));
		urls.put("com.sun.mail.util.SocketConnectException",
				AEM_DOMAIN.concat("com/sun/mail/util/SocketConnectException.html"));
		urls.put("javax.mail.AuthenticationFailedException",
				AEM_DOMAIN.concat("javax/mail/AuthenticationFailedException.html"));
		urls.put("javax.mail.FolderClosedException", AEM_DOMAIN.concat("javax/mail/FolderClosedException.html"));
		urls.put("javax.mail.FolderNotFoundException", AEM_DOMAIN.concat("javax/mail/FolderNotFoundException.html"));
		urls.put("javax.mail.IllegalWriteException", AEM_DOMAIN.concat("javax/mail/IllegalWriteException.html"));
		urls.put("javax.mail.MessageRemovedException", AEM_DOMAIN.concat("javax/mail/MessageRemovedException.html"));
		urls.put("javax.mail.MessagingException", AEM_DOMAIN.concat("javax/mail/MessagingException.html"));
		urls.put("javax.mail.MethodNotSupportedException",
				AEM_DOMAIN.concat("javax/mail/MethodNotSupportedException.html"));
		urls.put("javax.mail.NoSuchProviderException", AEM_DOMAIN.concat("javax/mail/NoSuchProviderException.html"));
		urls.put("javax.mail.ReadOnlyFolderException", AEM_DOMAIN.concat("javax/mail/ReadOnlyFolderException.html"));
		urls.put("javax.mail.SendFailedException", AEM_DOMAIN.concat("javax/mail/SendFailedException.html"));
		urls.put("javax.mail.StoreClosedException", AEM_DOMAIN.concat("javax/mail/StoreClosedException.html"));
		urls.put("javax.mail.internet.AddressException",
				AEM_DOMAIN.concat("javax/mail/internet/AddressException.html"));
		urls.put("javax.mail.internet.ParseException", AEM_DOMAIN.concat("javax/mail/internet/ParseException.html"));
		urls.put("javax.mail.search.SearchException", AEM_DOMAIN.concat("javax/mail/search/SearchException.html"));
		urls.put("opennlp.tools.util.InvalidFormatException",
				AEM_DOMAIN.concat("opennlp/tools/util/InvalidFormatException.html"));
		urls.put("opennlp.tools.util.ext.ExtensionNotLoadedException",
				AEM_DOMAIN.concat("opennlp/tools/util/ext/ExtensionNotLoadedException.html"));

		urls.put("org.apache.commons.codec.DecoderException",
				AEM_DOMAIN.concat("org/apache/commons/codec/DecoderException.html"));
		urls.put("org.apache.commons.codec.EncoderException",
				AEM_DOMAIN.concat("org/apache/commons/codec/EncoderException.html"));

		urls.put("org.apache.commons.collections4.FunctorException",
				AEM_DOMAIN.concat("org/apache/commons/collections4/FunctorException.html"));
		urls.put("org.apache.commons.compress.MemoryLimitException",
				AEM_DOMAIN.concat("org/apache/commons/compress/MemoryLimitException.html"));
		urls.put("org.apache.commons.compress.PasswordRequiredException",
				AEM_DOMAIN.concat("org/apache/commons/compress/PasswordRequiredException.html"));
		urls.put("org.apache.commons.compress.archivers.ArchiveException",
				AEM_DOMAIN.concat("org/apache/commons/compress/archivers/ArchiveException.html"));
		urls.put("org.apache.commons.compress.archivers.StreamingNotSupportedException",
				AEM_DOMAIN.concat("org/apache/commons/compress/archivers/StreamingNotSupportedException.html"));
		urls.put("org.apache.commons.compress.archivers.dump.DumpArchiveException",
				AEM_DOMAIN.concat("org/apache/commons/compress/archivers/dump/DumpArchiveException.html"));
		urls.put("org.apache.commons.compress.archivers.dump.InvalidFormatException",
				AEM_DOMAIN.concat("org/apache/commons/compress/archivers/dump/InvalidFormatException.html"));
		urls.put("org.apache.commons.compress.archivers.dump.ShortFileException",
				AEM_DOMAIN.concat("org/apache/commons/compress/archivers/dump/ShortFileException.html"));
		urls.put("org.apache.commons.compress.archivers.dump.UnrecognizedFormatException",
				AEM_DOMAIN.concat("org/apache/commons/compress/archivers/dump/UnrecognizedFormatException.html"));
		urls.put("org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException", AEM_DOMAIN
				.concat("org/apache/commons/compress/archivers/dump/UnsupportedCompressionAlgorithmException.html"));
		urls.put("org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException",
				AEM_DOMAIN.concat("org/apache/commons/compress/archivers/zip/UnsupportedZipFeatureException.html"));
		urls.put("org.apache.commons.compress.archivers.zip.Zip64RequiredException",
				AEM_DOMAIN.concat("org/apache/commons/compress/archivers/zip/Zip64RequiredException.html"));
		urls.put("org.apache.commons.compress.compressors.CompressorException",
				AEM_DOMAIN.concat("org/apache/commons/compress/compressors/CompressorException.html"));
		urls.put("org.apache.commons.exec.ExecuteException",
				AEM_DOMAIN.concat("org/apache/commons/exec/ExecuteException.html"));
		urls.put("org.apache.commons.fileupload.FileItemStream.ItemSkippedException",
				AEM_DOMAIN.concat("org/apache/commons/fileupload/FileItemStream.ItemSkippedException.html"));
		urls.put("org.apache.commons.fileupload.FileUploadBase.FileSizeLimitExceededException",
				AEM_DOMAIN.concat("org/apache/commons/fileupload/FileUploadBase.FileSizeLimitExceededException.html"));
		urls.put("org.apache.commons.fileupload.FileUploadBase.FileUploadIOException",
				AEM_DOMAIN.concat("org/apache/commons/fileupload/FileUploadBase.FileUploadIOException.html"));
		urls.put("org.apache.commons.fileupload.FileUploadBase.IOFileUploadException",
				AEM_DOMAIN.concat("org/apache/commons/fileupload/FileUploadBase.IOFileUploadException.html"));
		urls.put("org.apache.commons.fileupload.FileUploadBase.InvalidContentTypeException",
				AEM_DOMAIN.concat("org/apache/commons/fileupload/FileUploadBase.InvalidContentTypeException.html"));
		urls.put("org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException",
				AEM_DOMAIN.concat("org/apache/commons/fileupload/FileUploadBase.SizeLimitExceededException.html"));

		urls.put("org.apache.commons.fileupload.FileUploadException",
				AEM_DOMAIN.concat("org/apache/commons/fileupload/FileUploadException.html"));
		urls.put("org.apache.commons.fileupload.InvalidFileNameException",
				AEM_DOMAIN.concat("org/apache/commons/fileupload/InvalidFileNameException.html"));
		urls.put("org.apache.commons.fileupload.MultipartStream.IllegalBoundaryException",
				AEM_DOMAIN.concat("org/apache/commons/fileupload/MultipartStream.IllegalBoundaryException.html"));
		urls.put("org.apache.commons.fileupload.MultipartStream.MalformedStreamException",
				AEM_DOMAIN.concat("org/apache/commons/fileupload/MultipartStream.MalformedStreamException.html"));
		urls.put("org.apache.commons.imaging.ImageReadException",
				AEM_DOMAIN.concat("org/apache/commons/imaging/ImageReadException.html"));
		urls.put("org.apache.commons.imaging.ImageWriteException",
				AEM_DOMAIN.concat("org/apache/commons/imaging/ImageWriteException.html"));
		urls.put("org.apache.commons.imaging.ImagingException",
				AEM_DOMAIN.concat("org/apache/commons/imaging/ImagingException.html"));

		urls.put("org.apache.commons.io.FileExistsException",
				AEM_DOMAIN.concat("org/apache/commons/io/FileExistsException.html"));
		urls.put("org.apache.commons.io.TaggedIOException",
				AEM_DOMAIN.concat("org/apache/commons/io/TaggedIOException.html"));
		urls.put("org.apache.commons.io.input.XmlStreamReaderException",
				AEM_DOMAIN.concat("org/apache/commons/io/input/XmlStreamReaderException.html"));

		urls.put("org.apache.commons.lang3.NotImplementedException",
				AEM_DOMAIN.concat("org/apache/commons/lang3/NotImplementedException.html"));
		urls.put("org.apache.commons.lang3.SerializationException",
				AEM_DOMAIN.concat("org/apache/commons/lang3/SerializationException.html"));
		urls.put("org.apache.commons.lang3.concurrent.CircuitBreakingException",
				AEM_DOMAIN.concat("org/apache/commons/lang3/concurrent/CircuitBreakingException.html"));
		urls.put("org.apache.commons.lang3.concurrent.ConcurrentException",
				AEM_DOMAIN.concat("org/apache/commons/lang3/concurrent/ConcurrentException.html"));
		urls.put("org.apache.commons.lang3.concurrent.ConcurrentRuntimeException",
				AEM_DOMAIN.concat("org/apache/commons/lang3/concurrent/ConcurrentRuntimeException.html"));
		urls.put("org.apache.commons.lang3.exception.CloneFailedException",
				AEM_DOMAIN.concat("org/apache/commons/lang3/exception/CloneFailedException.html"));
		urls.put("org.apache.commons.lang3.exception.ContextedException",
				AEM_DOMAIN.concat("org/apache/commons/lang3/exception/ContextedException.html"));
		urls.put("org.apache.commons.lang3.exception.ContextedRuntimeException",
				AEM_DOMAIN.concat("org/apache/commons/lang3/exception/ContextedRuntimeException.html"));
		urls.put("org.apache.commons.logging.LogConfigurationException",
				AEM_DOMAIN.concat("org/apache/commons/logging/LogConfigurationException.html"));
		urls.put("org.apache.commons.mail.EmailException",
				AEM_DOMAIN.concat("org/apache/commons/mail/EmailException.html"));
		urls.put("org.apache.commons.math.ArgumentOutsideDomainException",
				AEM_DOMAIN.concat("org/apache/commons/math/ArgumentOutsideDomainException.html"));
		urls.put("org.apache.commons.math.ConvergenceException",
				AEM_DOMAIN.concat("org/apache/commons/math/ConvergenceException.html"));

		urls.put("org.apache.commons.math.DuplicateSampleAbscissaException",
				AEM_DOMAIN.concat("org/apache/commons/math/DuplicateSampleAbscissaException.html"));
		urls.put("org.apache.commons.math.FunctionEvaluationException",
				AEM_DOMAIN.concat("org/apache/commons/math/FunctionEvaluationException.html"));
		urls.put("org.apache.commons.math.MathConfigurationException",
				AEM_DOMAIN.concat("org/apache/commons/math/MathConfigurationException.html"));
		urls.put("org.apache.commons.math.MathException",
				AEM_DOMAIN.concat("org/apache/commons/math/MathException.html"));
		urls.put("org.apache.commons.math.MathRuntimeException",
				AEM_DOMAIN.concat("org/apache/commons/math/MathRuntimeException.html"));
		urls.put("org.apache.commons.math.MaxEvaluationsExceededException",
				AEM_DOMAIN.concat("org/apache/commons/math/MaxEvaluationsExceededException.html"));
		urls.put("org.apache.commons.math.MaxIterationsExceededException",
				AEM_DOMAIN.concat("org/apache/commons/math/MaxIterationsExceededException.html"));

		urls.put("org.apache.commons.math.exception.ConvergenceException",
				AEM_DOMAIN.concat("org/apache/commons/math/exception/ConvergenceException.html"));
		urls.put("org.apache.commons.math.exception.DimensionMismatchException",
				AEM_DOMAIN.concat("org/apache/commons/math/exception/DimensionMismatchException.html"));
		urls.put("org.apache.commons.math.exception.MathIllegalArgumentException",
				AEM_DOMAIN.concat("org/apache/commons/math/exception/MathIllegalArgumentException.html"));
		urls.put("org.apache.commons.math.exception.MathIllegalNumberException",
				AEM_DOMAIN.concat("org/apache/commons/math/exception/MathIllegalNumberException.html"));
		urls.put("org.apache.commons.math.exception.MathIllegalStateException",
				AEM_DOMAIN.concat("org/apache/commons/math/exception/MathIllegalStateException.html"));
		urls.put("org.apache.commons.math.exception.MathUnsupportedOperationException",
				AEM_DOMAIN.concat("org/apache/commons/math/exception/MathUnsupportedOperationException.html"));
		urls.put("org.apache.commons.math.exception.NoDataException",
				AEM_DOMAIN.concat("org/apache/commons/math/exception/NoDataException.html"));
		urls.put("org.apache.commons.math.exception.NonMonotonousSequenceException",
				AEM_DOMAIN.concat("org/apache/commons/math/exception/NonMonotonousSequenceException.html"));
		urls.put("org.apache.commons.math.exception.NotPositiveException",
				AEM_DOMAIN.concat("org/apache/commons/math/exception/NotPositiveException.html"));
		urls.put("org.apache.commons.math.exception.NotStrictlyPositiveException",
				AEM_DOMAIN.concat("org/apache/commons/math/exception/NotStrictlyPositiveException.html"));
		urls.put("org.apache.commons.math.exception.NullArgumentException",
				AEM_DOMAIN.concat("org/apache/commons/math/exception/NullArgumentException.html"));
		urls.put("org.apache.commons.math.exception.NumberIsTooLargeException",
				AEM_DOMAIN.concat("org/apache/commons/math/exception/NumberIsTooLargeException.html"));
		urls.put("org.apache.commons.math.exception.NumberIsTooSmallException",
				AEM_DOMAIN.concat("org/apache/commons/math/exception/NumberIsTooSmallException.html"));
		urls.put("org.apache.commons.math.exception.OutOfRangeException",
				AEM_DOMAIN.concat("org/apache/commons/math/exception/OutOfRangeException.html"));
		urls.put("org.apache.commons.math.exception.ZeroException",
				AEM_DOMAIN.concat("org/apache/commons/math/exception/ZeroException.html"));
		urls.put("org.apache.commons.math.fraction.FractionConversionException",
				AEM_DOMAIN.concat("org/apache/commons/math/fraction/FractionConversionException.html"));
		urls.put("org.apache.commons.math.genetics.InvalidRepresentationException",
				AEM_DOMAIN.concat("org/apache/commons/math/genetics/InvalidRepresentationException.html"));
		urls.put("org.apache.commons.math.geometry.CardanEulerSingularityException",
				AEM_DOMAIN.concat("org/apache/commons/math/geometry/CardanEulerSingularityException.html"));
		urls.put("org.apache.commons.math.geometry.NotARotationMatrixException",
				AEM_DOMAIN.concat("org/apache/commons/math/geometry/NotARotationMatrixException.html"));
		urls.put("org.apache.commons.math.linear.InvalidMatrixException",
				AEM_DOMAIN.concat("org/apache/commons/math/linear/InvalidMatrixException.html"));
		urls.put("org.apache.commons.math.linear.MatrixIndexException",
				AEM_DOMAIN.concat("org/apache/commons/math/linear/MatrixIndexException.html"));
		urls.put("org.apache.commons.math.linear.MatrixVisitorException",
				AEM_DOMAIN.concat("org/apache/commons/math/linear/MatrixVisitorException.html"));
		urls.put("org.apache.commons.math.linear.NonSquareMatrixException",
				AEM_DOMAIN.concat("org/apache/commons/math/linear/NonSquareMatrixException.html"));
		urls.put("org.apache.commons.math.linear.NotPositiveDefiniteMatrixException",
				AEM_DOMAIN.concat("org/apache/commons/math/linear/NotPositiveDefiniteMatrixException.html"));
		urls.put("org.apache.commons.math.linear.NotSymmetricMatrixException",
				AEM_DOMAIN.concat("org/apache/commons/math/linear/NotSymmetricMatrixException.html"));
		urls.put("org.apache.commons.math.linear.SingularMatrixException",
				AEM_DOMAIN.concat("org/apache/commons/math/linear/SingularMatrixException.html"));
		urls.put("org.apache.commons.math.ode.DerivativeException",
				AEM_DOMAIN.concat("org/apache/commons/math/ode/DerivativeException.html"));
		urls.put("org.apache.commons.math.ode.IntegratorException",
				AEM_DOMAIN.concat("org/apache/commons/math/ode/IntegratorException.html"));
		urls.put("org.apache.commons.math.ode.events.EventException",
				AEM_DOMAIN.concat("org/apache/commons/math/ode/events/EventException.html"));

		urls.put("org.apache.commons.math.optimization.linear.NoFeasibleSolutionException",
				AEM_DOMAIN.concat("org/apache/commons/math/optimization/linear/NoFeasibleSolutionException.html"));
		urls.put("org.apache.commons.math.optimization.linear.UnboundedSolutionException",
				AEM_DOMAIN.concat("org/apache/commons/math/optimization/linear/UnboundedSolutionException.html"));
		urls.put("org.apache.jackrabbit.api.ReferenceBinaryException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/api/ReferenceBinaryException.html"));
		urls.put("org.apache.jackrabbit.api.security.user.AuthorizableExistsException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/api/security/user/AuthorizableExistsException.html"));
		urls.put("org.apache.jackrabbit.api.security.user.AuthorizableTypeException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/api/security/user/AuthorizableTypeException.html"));
		urls.put("org.apache.jackrabbit.commons.cnd.ParseException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/commons/cnd/ParseException.html"));
		urls.put("org.apache.jackrabbit.core.config.ConfigurationException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/core/config/ConfigurationException.html"));
		urls.put("org.apache.jackrabbit.core.data.DataStoreException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/core/data/DataStoreException.html"));
		urls.put("org.apache.jackrabbit.core.fs.FileSystemException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/core/fs/FileSystemException.html"));
		urls.put("org.apache.jackrabbit.data.core.TransactionException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/data/core/TransactionException.html"));
		urls.put("org.apache.jackrabbit.oak.api.CommitFailedException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/oak/api/CommitFailedException.html"));
		urls.put("org.apache.jackrabbit.oak.api.IllegalRepositoryStateException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/oak/api/IllegalRepositoryStateException.html"));
		urls.put("org.apache.jackrabbit.oak.spi.security.authentication.external.ExternalIdentityException", AEM_DOMAIN
				.concat("org/apache/jackrabbit/oak/spi/security/authentication/external/ExternalIdentityException.html"));
		urls.put("org.apache.jackrabbit.oak.spi.security.authentication.external.SyncException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/oak/spi/security/authentication/external/SyncException.html"));
		urls.put("org.apache.jackrabbit.spi.commons.conversion.IllegalNameException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/spi/commons/conversion/IllegalNameException.html"));
		urls.put("org.apache.jackrabbit.spi.commons.conversion.MalformedPathException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/spi/commons/conversion/MalformedPathException.html"));
		urls.put("org.apache.jackrabbit.spi.commons.conversion.NameException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/spi/commons/conversion/NameException.html"));
		urls.put("org.apache.jackrabbit.spi.commons.nodetype.InvalidConstraintException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/spi/commons/nodetype/InvalidConstraintException.html"));
		urls.put("org.apache.jackrabbit.spi.commons.nodetype.NodeTypeConflictException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/spi/commons/nodetype/NodeTypeConflictException.html"));
		urls.put("org.apache.jackrabbit.spi.commons.privilege.ParseException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/spi/commons/privilege/ParseException.html"));
		urls.put("org.apache.jackrabbit.spi.commons.query.sql.ParseException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/spi/commons/query/sql/ParseException.html"));
		urls.put("org.apache.jackrabbit.spi.commons.query.xpath.ParseException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/spi/commons/query/xpath/ParseException.html"));
		urls.put("org.apache.jackrabbit.vault.fs.config.ConfigurationException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/vault/fs/config/ConfigurationException.html"));
		urls.put("org.apache.jackrabbit.vault.packaging.CyclicDependencyException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/vault/packaging/CyclicDependencyException.html"));
		urls.put("org.apache.jackrabbit.vault.packaging.DependencyException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/vault/packaging/DependencyException.html"));
		urls.put("org.apache.jackrabbit.vault.packaging.NoSuchPackageException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/vault/packaging/NoSuchPackageException.html"));
		urls.put("org.apache.jackrabbit.vault.packaging.PackageException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/vault/packaging/PackageException.html"));
		urls.put("org.apache.jackrabbit.vault.packaging.PackageExistsException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/vault/packaging/PackageExistsException.html"));
		urls.put("org.apache.jackrabbit.vault.util.xml.xerces.xni.XNIException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/vault/util/xml/xerces/xni/XNIException.html"));
		urls.put("org.apache.jackrabbit.vault.util.xml.xerces.xni.parser.XMLParseException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/vault/util/xml/xerces/xni/parser/XMLParseException.html"));
		urls.put("org.apache.jackrabbit.webdav.DavException",
				AEM_DOMAIN.concat("org/apache/jackrabbit/webdav/DavException.html"));
		urls.put("org.apache.oltu.oauth2.common.exception.OAuthProblemException",
				AEM_DOMAIN.concat("org/apache/oltu/oauth2/common/exception/OAuthProblemException.html"));
		urls.put("org.apache.oltu.oauth2.common.exception.OAuthRuntimeException",
				AEM_DOMAIN.concat("org/apache/oltu/oauth2/common/exception/OAuthRuntimeException.html"));
		urls.put("org.apache.oltu.oauth2.common.exception.OAuthSystemException",
				AEM_DOMAIN.concat("org/apache/oltu/oauth2/common/exception/OAuthSystemException.html"));
		urls.put("org.apache.sling.api.SlingException", AEM_DOMAIN.concat("org/apache/sling/api/SlingException.html"));
		urls.put("org.apache.sling.api.SlingIOException",
				AEM_DOMAIN.concat("org/apache/sling/api/SlingIOException.html"));
		urls.put("org.apache.sling.api.SlingServletException",
				AEM_DOMAIN.concat("org/apache/sling/api/SlingServletException.html"));
		urls.put("org.apache.sling.api.auth.NoAuthenticationHandlerException",
				AEM_DOMAIN.concat("org/apache/sling/api/auth/NoAuthenticationHandlerException.html"));
		urls.put("org.apache.sling.api.request.RecursionTooDeepException",
				AEM_DOMAIN.concat("org/apache/sling/api/request/RecursionTooDeepException.html"));
		urls.put("org.apache.sling.api.request.TooManyCallsException",
				AEM_DOMAIN.concat("org/apache/sling/api/request/TooManyCallsException.html"));
		urls.put("org.apache.sling.api.resource.LoginException",
				AEM_DOMAIN.concat("org/apache/sling/api/resource/LoginException.html"));
		urls.put("org.apache.sling.api.resource.PersistenceException",
				AEM_DOMAIN.concat("org/apache/sling/api/resource/PersistenceException.html"));
		urls.put("org.apache.sling.api.resource.QuerySyntaxException",
				AEM_DOMAIN.concat("org/apache/sling/api/resource/QuerySyntaxException.html"));
		urls.put("org.apache.sling.api.resource.ResourceNotFoundException",
				AEM_DOMAIN.concat("org/apache/sling/api/resource/ResourceNotFoundException.html"));
		urls.put("org.apache.sling.api.scripting.InvalidServiceFilterSyntaxException",
				AEM_DOMAIN.concat("org/apache/sling/api/scripting/InvalidServiceFilterSyntaxException.html"));
		urls.put("org.apache.sling.api.scripting.ScriptEvaluationException",
				AEM_DOMAIN.concat("org/apache/sling/api/scripting/ScriptEvaluationException.html"));
		urls.put("org.apache.sling.api.security.AccessSecurityException",
				AEM_DOMAIN.concat("org/apache/sling/api/security/AccessSecurityException.html"));
		urls.put("org.apache.sling.caconfig.ConfigurationResolveException",
				AEM_DOMAIN.concat("org/apache/sling/caconfig/ConfigurationResolveException.html"));
		urls.put("org.apache.sling.caconfig.spi.ConfigurationPersistenceAccessDeniedException",
				AEM_DOMAIN.concat("org/apache/sling/caconfig/spi/ConfigurationPersistenceAccessDeniedException.html"));
		urls.put("org.apache.sling.caconfig.spi.ConfigurationPersistenceException",
				AEM_DOMAIN.concat("org/apache/sling/caconfig/spi/ConfigurationPersistenceException.html"));

		urls.put("org.apache.sling.distribution.common.DistributionException",
				AEM_DOMAIN.concat("org/apache/sling/distribution/common/DistributionException.html"));
		urls.put("org.apache.sling.distribution.common.RecoverableDistributionException",
				AEM_DOMAIN.concat("org/apache/sling/distribution/common/RecoverableDistributionException.html"));

		urls.put("org.apache.sling.hapi.HApiException", AEM_DOMAIN.concat("org/apache/sling/hapi/HApiException.html"));

		urls.put("org.apache.sling.models.factory.ExportException",
				AEM_DOMAIN.concat("org/apache/sling/models/factory/ExportException.html"));
		urls.put("org.apache.sling.models.factory.InvalidAdaptableException",
				AEM_DOMAIN.concat("org/apache/sling/models/factory/InvalidAdaptableException.html"));
		urls.put("org.apache.sling.models.factory.InvalidModelException",
				AEM_DOMAIN.concat("org/apache/sling/models/factory/InvalidModelException.html"));
		urls.put("org.apache.sling.models.factory.MissingElementException",
				AEM_DOMAIN.concat("org/apache/sling/models/factory/MissingElementException.html"));
		urls.put("org.apache.sling.models.factory.MissingElementsException",
				AEM_DOMAIN.concat("org/apache/sling/models/factory/MissingElementsException.html"));
		urls.put("org.apache.sling.models.factory.MissingExporterException",
				AEM_DOMAIN.concat("org/apache/sling/models/factory/MissingExporterException.html"));
		urls.put("org.apache.sling.models.factory.ModelClassException",
				AEM_DOMAIN.concat("org/apache/sling/models/factory/ModelClassException.html"));
		urls.put("org.apache.sling.models.factory.PostConstructException",
				AEM_DOMAIN.concat("org/apache/sling/models/factory/PostConstructException.html"));
		urls.put("org.apache.sling.models.factory.ValidationException",
				AEM_DOMAIN.concat("org/apache/sling/models/factory/ValidationException.html"));
		urls.put("org.apache.sling.scripting.sightly.SightlyException",
				AEM_DOMAIN.concat("org/apache/sling/scripting/sightly/SightlyException.html"));
		urls.put("org.apache.sling.scripting.sightly.compiler.SightlyCompilerException",
				AEM_DOMAIN.concat("org/apache/sling/scripting/sightly/compiler/SightlyCompilerException.html"));
		urls.put("org.apache.sling.scripting.sightly.java.compiler.SightlyJavaCompilerException", AEM_DOMAIN
				.concat("org/apache/sling/scripting/sightly/java/compiler/SightlyJavaCompilerException.html"));
		urls.put("org.apache.tika.exception.AccessPermissionException",
				AEM_DOMAIN.concat("org/apache/tika/exception/AccessPermissionException.html"));
		urls.put("org.apache.tika.exception.CorruptedFileException",
				AEM_DOMAIN.concat("org/apache/tika/exception/CorruptedFileException.html"));
		urls.put("org.apache.tika.exception.EncryptedDocumentException",
				AEM_DOMAIN.concat("org/apache/tika/exception/EncryptedDocumentException.html"));
		urls.put("org.apache.tika.exception.TikaConfigException",
				AEM_DOMAIN.concat("org/apache/tika/exception/TikaConfigException.html"));
		urls.put("org.apache.tika.exception.TikaException",
				AEM_DOMAIN.concat("org/apache/tika/exception/TikaException.html"));
		urls.put("org.apache.tika.exception.TikaMemoryLimitException",
				AEM_DOMAIN.concat("org/apache/tika/exception/TikaMemoryLimitException.html"));
		urls.put("org.apache.tika.exception.UnsupportedFormatException",
				AEM_DOMAIN.concat("org/apache/tika/exception/UnsupportedFormatException.html"));
		urls.put("org.apache.tika.exception.ZeroByteFileException",
				AEM_DOMAIN.concat("org/apache/tika/exception/ZeroByteFileException.html"));
		urls.put("org.apache.tika.io.EndianUtils.BufferUnderrunException",
				AEM_DOMAIN.concat("org/apache/tika/io/EndianUtils.BufferUnderrunException.html"));
		urls.put("org.apache.tika.io.TaggedIOException",
				AEM_DOMAIN.concat("org/apache/tika/io/TaggedIOException.html"));
		urls.put("org.apache.tika.metadata.PropertyTypeException",
				AEM_DOMAIN.concat("org/apache/tika/metadata/PropertyTypeException.html"));
		urls.put("org.apache.tika.mime.MimeTypeException",
				AEM_DOMAIN.concat("org/apache/tika/mime/MimeTypeException.html"));
		urls.put("org.apache.tika.parser.chm.exception.ChmParsingException",
				AEM_DOMAIN.concat("org/apache/tika/parser/chm/exception/ChmParsingException.html"));
		urls.put("org.apache.tika.parser.utils.DataURISchemeParseException",
				AEM_DOMAIN.concat("org/apache/tika/parser/utils/DataURISchemeParseException.html"));
		urls.put("org.apache.tika.sax.TaggedSAXException",
				AEM_DOMAIN.concat("org/apache/tika/sax/TaggedSAXException.html"));
		urls.put("org.joda.time.IllegalFieldValueException",
				AEM_DOMAIN.concat("org/joda/time/IllegalFieldValueException.html"));
		urls.put("org.joda.time.IllegalInstantException",
				AEM_DOMAIN.concat("org/joda/time/IllegalInstantException.html"));
		urls.put("org.kohsuke.rngom.rngparser.ast.builder.BuildException",
				AEM_DOMAIN.concat("org/kohsuke/rngom/rngparser/ast/builder/BuildException.html"));
		urls.put("org.kohsuke.rngom.rngparser.parse.IllegalSchemaException",
				AEM_DOMAIN.concat("org/kohsuke/rngom/rngparser/parse/IllegalSchemaException.html"));
		urls.put("org.kohsuke.rngom.rngparser.parse.compact.EOFException",
				AEM_DOMAIN.concat("org/kohsuke/rngom/rngparser/parse/compact/EOFException.html"));
		urls.put("org.mozillafileFileWriterFileFormatException",
				AEM_DOMAIN.concat("org/mozilla/classfile/ClassFileWriterFileFormatException.html"));
		urls.put("org.mozilla.javascript.EvaluatorException",
				AEM_DOMAIN.concat("org/mozilla/javascript/EvaluatorException.html"));
		urls.put("org.mozilla.javascript.JavaScriptException",
				AEM_DOMAIN.concat("org/mozilla/javascript/JavaScriptException.html"));
		urls.put("org.mozilla.javascript.NativeGenerator.GeneratorClosedException",
				AEM_DOMAIN.concat("org/mozilla/javascript/NativeGenerator.GeneratorClosedException.html"));
		urls.put("org.mozilla.javascript.RhinoException",
				AEM_DOMAIN.concat("org/mozilla/javascript/RhinoException.html"));
		urls.put("org.mozilla.javascript.WrappedException",
				AEM_DOMAIN.concat("org/mozilla/javascript/WrappedException.html"));
		urls.put("org.mozilla.javascript.json.JsonParser.ParseException",
				AEM_DOMAIN.concat("org/mozilla/javascript/json/JsonParser.ParseException.html"));
		urls.put("org.osgi.util.converter.ConversionException",
				AEM_DOMAIN.concat("org/osgi/util/converter/ConversionException.html"));
		urls.put("org.osgi.util.promise.FailedPromisesException",
				AEM_DOMAIN.concat("org/osgi/util/promise/FailedPromisesException.html"));
		urls.put("org.osgi.util.promise.TimeoutException",
				AEM_DOMAIN.concat("org/osgi/util/promise/TimeoutException.html"));

//		Deprecated
		urls.put("ch.qos.logback.core.LogbackException",
				AEM_DOMAIN.concat("ch/qos/logback/core/LogbackException.html"));
		urls.put("ch.qos.logback.core.boolex.EvaluationException",
				AEM_DOMAIN.concat("ch/qos/logback/core/boolex/EvaluationException.html"));
		urls.put("ch.qos.logback.core.joran.spi.ActionException",
				AEM_DOMAIN.concat("ch/qos/logback/core/joran/spi/ActionException.html"));
		urls.put("ch.qos.logback.core.joran.spi.JoranException",
				AEM_DOMAIN.concat("ch/qos/logback/core/joran/spi/JoranException.html"));
		urls.put("ch.qos.logback.core.spi.ScanException",
				AEM_DOMAIN.concat("ch/qos/logback/core/spi/ScanException.html"));
		urls.put("ch.qos.logback.core.util.DynamicClassLoadingException",
				AEM_DOMAIN.concat("ch/qos/logback/core/util/DynamicClassLoadingException.html"));
		urls.put("ch.qos.logback.core.util.IncompatibleClassException",
				AEM_DOMAIN.concat("ch/qos/logback/core/util/IncompatibleClassException.html"));
		urls.put("ch.qos.logback.core.util.PropertySetterException",
				AEM_DOMAIN.concat("ch/qos/logback/core/util/PropertySetterException.html"));
		urls.put("com.adobe.cq.address.api.AddressException",
				AEM_DOMAIN.concat("com/adobe/cq/address/api/AddressException.html"));
		urls.put("com.adobe.granite.offloading.api.OffloadingException",
				AEM_DOMAIN.concat("com/adobe/granite/offloading/api/OffloadingException.html"));
		urls.put("com.day.cq.searchpromote.SearchPromoteException",
				AEM_DOMAIN.concat("com/day/cq/searchpromote/SearchPromoteException.html"));
		urls.put("com.day.cq.security.AuthorizableExistsException",
				AEM_DOMAIN.concat("com/day/cq/security/AuthorizableExistsException.html"));
		urls.put("com.day.cq.security.CqSecurityException",
				AEM_DOMAIN.concat("com/day/cq/security/CqSecurityException.html"));
		urls.put("com.day.cq.security.NoSuchAuthorizableException",
				AEM_DOMAIN.concat("com/day/cq/security/NoSuchAuthorizableException.html"));
		urls.put("com.day.cq.security.NoSuchPrivilegeException",
				AEM_DOMAIN.concat("com/day/cq/security/NoSuchPrivilegeException.html"));
		urls.put("com.day.cq.xss.XSSProtectionException",
				AEM_DOMAIN.concat("com/day/cq/xss/XSSProtectionException.html"));
		urls.put("com.mongodb.BulkWriteException", AEM_DOMAIN.concat("com/mongodb/BulkWriteException.html"));
		urls.put("com.mongodb.DuplicateKeyException", AEM_DOMAIN.concat("com/mongodb/DuplicateKeyException.html"));
		urls.put("com.mongodb.MongoBulkWriteException", AEM_DOMAIN.concat("com/mongodb/MongoBulkWriteException.html"));
		urls.put("com.mongodb.MongoChangeStreamException",
				AEM_DOMAIN.concat("com/mongodb/MongoChangeStreamException.html"));
		urls.put("com.mongodb.MongoClientException", AEM_DOMAIN.concat("com/mongodb/MongoClientException.html"));
		urls.put("com.mongodb.MongoCommandException", AEM_DOMAIN.concat("com/mongodb/MongoCommandException.html"));
		urls.put("com.mongodb.MongoConfigurationException",
				AEM_DOMAIN.concat("com/mongodb/MongoConfigurationException.html"));
		urls.put("com.mongodb.MongoCursorNotFoundException",
				AEM_DOMAIN.concat("com/mongodb/MongoCursorNotFoundException.html"));
		urls.put("com.mongodb.MongoException", AEM_DOMAIN.concat("com/mongodb/MongoException.html"));
		urls.put("com.mongodb.MongoExecutionTimeoutException",
				AEM_DOMAIN.concat("com/mongodb/MongoExecutionTimeoutException.html"));
		urls.put("com.mongodb.MongoGridFSException", AEM_DOMAIN.concat("com/mongodb/MongoGridFSException.html"));
		urls.put("com.mongodb.MongoIncompatibleDriverException",
				AEM_DOMAIN.concat("com/mongodb/MongoIncompatibleDriverException.html"));
		urls.put("com.mongodb.MongoInternalException", AEM_DOMAIN.concat("com/mongodb/MongoInternalException.html"));
		urls.put("com.mongodb.MongoInterruptedException",
				AEM_DOMAIN.concat("com/mongodb/MongoInterruptedException.html"));
		urls.put("com.mongodb.MongoNodeIsRecoveringException",
				AEM_DOMAIN.concat("com/mongodb/MongoNodeIsRecoveringException.html"));
		urls.put("com.mongodb.MongoNotPrimaryException",
				AEM_DOMAIN.concat("com/mongodb/MongoNotPrimaryException.html"));
		urls.put("com.mongodb.MongoQueryException", AEM_DOMAIN.concat("com/mongodb/MongoQueryException.html"));
		urls.put("com.mongodb.MongoSecurityException", AEM_DOMAIN.concat("com/mongodb/MongoSecurityException.html"));
		urls.put("com.mongodb.MongoServerException", AEM_DOMAIN.concat("com/mongodb/MongoServerException.html"));
		urls.put("com.mongodb.MongoSocketClosedException",
				AEM_DOMAIN.concat("com/mongodb/MongoSocketClosedException.html"));
		urls.put("com.mongodb.MongoSocketException", AEM_DOMAIN.concat("com/mongodb/MongoSocketException.html"));
		urls.put("com.mongodb.MongoSocketOpenException",
				AEM_DOMAIN.concat("com/mongodb/MongoSocketOpenException.html"));
		urls.put("com.mongodb.MongoSocketReadException",
				AEM_DOMAIN.concat("com/mongodb/MongoSocketReadException.html"));
		urls.put("com.mongodb.MongoSocketReadTimeoutException",
				AEM_DOMAIN.concat("com/mongodb/MongoSocketReadTimeoutException.html"));
		urls.put("com.mongodb.MongoSocketWriteException",
				AEM_DOMAIN.concat("com/mongodb/MongoSocketWriteException.html"));
		urls.put("com.mongodb.MongoTimeoutException", AEM_DOMAIN.concat("com/mongodb/MongoTimeoutException.html"));
		urls.put("com.mongodb.MongoWaitQueueFullException",
				AEM_DOMAIN.concat("com/mongodb/MongoWaitQueueFullException.html"));
		urls.put("com.mongodb.MongoWriteConcernException",
				AEM_DOMAIN.concat("com/mongodb/MongoWriteConcernException.html"));
		urls.put("com.mongodb.MongoWriteException", AEM_DOMAIN.concat("com/mongodb/MongoWriteException.html"));
		urls.put("com.mongodb.WriteConcernException", AEM_DOMAIN.concat("com/mongodb/WriteConcernException.html"));
		urls.put("com.mongodb.internal.connection.MongoWriteConcernWithResponseException",
				AEM_DOMAIN.concat("com/mongodb/internal/connection/MongoWriteConcernWithResponseException.html"));
		urls.put("com.mongodb.util.JSONParseException", AEM_DOMAIN.concat("com/mongodb/util/JSONParseException.html"));
		urls.put("org.apache.abdera.i18n.iri.IRISyntaxException",
				AEM_DOMAIN.concat("org/apache/abdera/i18n/iri/IRISyntaxException.html"));
		urls.put("org.apache.abdera.i18n.text.InvalidCharacterException",
				AEM_DOMAIN.concat("org/apache/abdera/i18n/text/InvalidCharacterException.html"));
		urls.put("org.apache.abdera.util.MimeTypeParseException",
				AEM_DOMAIN.concat("org/apache/abdera/util/MimeTypeParseException.html"));
		urls.put("org.apache.abdera.xpath.XPathException",
				AEM_DOMAIN.concat("org/apache/abdera/xpath/XPathException.html"));
		urls.put("org.apache.commons.collections.BufferOverflowException",
				AEM_DOMAIN.concat("org/apache/commons/collections/BufferOverflowException.html"));
		urls.put("org.apache.commons.collections.BufferUnderflowException",
				AEM_DOMAIN.concat("org/apache/commons/collections/BufferUnderflowException.html"));
		urls.put("org.apache.commons.collections.FunctorException",
				AEM_DOMAIN.concat("org/apache/commons/collections/FunctorException.html"));
		urls.put("org.apache.commons.io.DirectoryWalker.CancelException",
				AEM_DOMAIN.concat("org/apache/commons/io/DirectoryWalker.CancelException.html"));
		urls.put("org.apache.commons.fileupload.FileUploadBase.UnknownSizeException",
				AEM_DOMAIN.concat("org/apache/commons/fileupload/FileUploadBase.UnknownSizeException.html"));
		urls.put("org.apache.commons.lang.IllegalClassException",
				AEM_DOMAIN.concat("org/apache/commons/lang/IllegalClassException.html"));
		urls.put("org.apache.commons.lang.IncompleteArgumentException",
				AEM_DOMAIN.concat("org/apache/commons/lang/IncompleteArgumentException.html"));
		urls.put("org.apache.commons.lang.NotImplementedException",
				AEM_DOMAIN.concat("org/apache/commons/lang/NotImplementedException.html"));
		urls.put("org.apache.commons.lang.NullArgumentException",
				AEM_DOMAIN.concat("org/apache/commons/lang/NullArgumentException.html"));
		urls.put("org.apache.commons.lang.SerializationException",
				AEM_DOMAIN.concat("org/apache/commons/lang/SerializationException.html"));
		urls.put("org.apache.commons.lang.UnhandledException",
				AEM_DOMAIN.concat("org/apache/commons/lang/UnhandledException.html"));
		urls.put("org.apache.commons.lang.exception.CloneFailedException",
				AEM_DOMAIN.concat("org/apache/commons/lang/exception/CloneFailedException.html"));
		urls.put("org.apache.commons.lang.exception.NestableException",
				AEM_DOMAIN.concat("org/apache/commons/lang/exception/NestableException.html"));
		urls.put("org.apache.commons.lang.exception.NestableRuntimeException",
				AEM_DOMAIN.concat("org/apache/commons/lang/exception/NestableRuntimeException.html"));
		urls.put("org.apache.commons.math.DimensionMismatchException",
				AEM_DOMAIN.concat("org/apache/commons/math/DimensionMismatchException.html"));
		urls.put("org.apache.commons.math.estimation.EstimationException",
				AEM_DOMAIN.concat("org/apache/commons/math/estimation/EstimationException.html"));
		urls.put("org.apache.commons.math.optimization.OptimizationException",
				AEM_DOMAIN.concat("org/apache/commons/math/optimization/OptimizationException.html"));
		urls.put("org.apache.sling.commons.auth.NoAuthenticationHandlerException",
				AEM_DOMAIN.concat("org/apache/sling/commons/auth/NoAuthenticationHandlerException.html"));
		urls.put("org.apache.sling.commons.json.JSONException",
				AEM_DOMAIN.concat("org/apache/sling/commons/json/JSONException.html"));
		urls.put("org.apache.sling.engine.auth.NoAuthenticationHandlerException",
				AEM_DOMAIN.concat("org/apache/sling/engine/auth/NoAuthenticationHandlerException.html"));
		urls.put("org.apache.sling.jcr.api.TooManySessionsException",
				AEM_DOMAIN.concat("org/apache/sling/jcr/api/TooManySessionsException.html"));
		urls.put("org.bson.BSONException", AEM_DOMAIN.concat("org/bson/BSONException.html"));
		urls.put("org.bson.BsonInvalidOperationException",
				AEM_DOMAIN.concat("org/bson/BsonInvalidOperationException.html"));
		urls.put("org.bson.BsonMaximumSizeExceededException",
				AEM_DOMAIN.concat("org/bson/BsonMaximumSizeExceededException.html"));
		urls.put("org.bson.BsonSerializationException", AEM_DOMAIN.concat("org/bson/BsonSerializationException.html"));
		urls.put("org.bson.codecs.configuration.CodecConfigurationException",
				AEM_DOMAIN.concat("org/bson/codecs/configuration/CodecConfigurationException.html"));
		urls.put("org.bson.json.JsonParseException", AEM_DOMAIN.concat("org/bson/json/JsonParseException.html"));

		return urls;
	}

}
