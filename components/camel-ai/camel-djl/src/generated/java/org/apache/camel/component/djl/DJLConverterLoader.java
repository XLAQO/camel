/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.djl;

import javax.annotation.processing.Generated;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.DeferredContextBinding;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.TypeConverterLoaderGeneratorMojo")
@SuppressWarnings("unchecked")
@DeferredContextBinding
public final class DJLConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public DJLConverterLoader() {
    }

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public CamelContext getCamelContext() {
        return camelContext;
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, ai.djl.modality.audio.Audio.class, byte[].class, false,
            (type, exchange, value) -> org.apache.camel.component.djl.DJLConverter.toAudio((byte[]) value));
        addTypeConverter(registry, ai.djl.modality.audio.Audio.class, java.io.File.class, false,
            (type, exchange, value) -> org.apache.camel.component.djl.DJLConverter.toAudio((java.io.File) value));
        addTypeConverter(registry, ai.djl.modality.audio.Audio.class, java.io.InputStream.class, false,
            (type, exchange, value) -> org.apache.camel.component.djl.DJLConverter.toAudio((java.io.InputStream) value));
        addTypeConverter(registry, ai.djl.modality.audio.Audio.class, java.nio.file.Path.class, false,
            (type, exchange, value) -> org.apache.camel.component.djl.DJLConverter.toAudio((java.nio.file.Path) value));
        addTypeConverter(registry, ai.djl.modality.cv.Image.class, ai.djl.modality.cv.output.DetectedObjects.DetectedObject.class, false,
            (type, exchange, value) -> org.apache.camel.component.djl.DJLConverter.toImage((ai.djl.modality.cv.output.DetectedObjects.DetectedObject) value, exchange));
        addTypeConverter(registry, ai.djl.modality.cv.Image.class, byte[].class, false,
            (type, exchange, value) -> org.apache.camel.component.djl.DJLConverter.toImage((byte[]) value));
        addTypeConverter(registry, ai.djl.modality.cv.Image.class, java.io.File.class, false,
            (type, exchange, value) -> org.apache.camel.component.djl.DJLConverter.toImage((java.io.File) value));
        addTypeConverter(registry, ai.djl.modality.cv.Image.class, java.io.InputStream.class, false,
            (type, exchange, value) -> org.apache.camel.component.djl.DJLConverter.toImage((java.io.InputStream) value));
        addTypeConverter(registry, ai.djl.modality.cv.Image.class, java.nio.file.Path.class, false,
            (type, exchange, value) -> org.apache.camel.component.djl.DJLConverter.toImage((java.nio.file.Path) value));
        addTypeConverter(registry, ai.djl.modality.cv.Image[].class, ai.djl.modality.cv.output.DetectedObjects.class, false,
            (type, exchange, value) -> org.apache.camel.component.djl.DJLConverter.toImages((ai.djl.modality.cv.output.DetectedObjects) value, exchange));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) {
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }
}
