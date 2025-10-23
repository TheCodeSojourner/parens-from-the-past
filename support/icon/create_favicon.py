#!/usr/bin/env python3
"""Convert logo to favicon formats"""

from PIL import Image
import os

# The image data will be loaded from the uploaded file
def create_favicon(input_file, output_dir='.'):
    """Create favicon from input image"""
    
    # Open the original image
    img = Image.open(input_file)
    
    # Convert to RGBA if not already
    if img.mode != 'RGBA':
        img = img.convert('RGBA')
    
    print(f"Original image size: {img.size}")
    
    # Standard favicon sizes
    sizes = [16, 32, 48, 64, 128, 192, 256]
    
    # Create individual PNG favicons
    for size in sizes:
        favicon = img.resize((size, size), Image.Resampling.LANCZOS)
        output_path = os.path.join(output_dir, f'favicon-{size}x{size}.png')
        favicon.save(output_path, 'PNG')
        print(f"Created: {output_path}")
    
    # Create .ico file with multiple sizes (16, 32, 48)
    ico_sizes = [(16, 16), (32, 32), (48, 48)]
    ico_images = []
    
    for size in ico_sizes:
        ico_img = img.resize(size, Image.Resampling.LANCZOS)
        ico_images.append(ico_img)
    
    ico_path = os.path.join(output_dir, 'favicon.ico')
    ico_images[0].save(ico_path, format='ICO', sizes=ico_sizes)
    print(f"Created: {ico_path}")
    
    print("\nFavicon generation complete!")
    print("\nUsage in HTML:")
    print('  <link rel="icon" type="image/x-icon" href="favicon.ico">')
    print('  <link rel="icon" type="image/png" sizes="32x32" href="favicon-32x32.png">')
    print('  <link rel="icon" type="image/png" sizes="16x16" href="favicon-16x16.png">')
    print('  <link rel="apple-touch-icon" sizes="192x192" href="favicon-192x192.png">')

if __name__ == '__main__':
    print("Processing cljonic-logo.png...")
    create_favicon('cljonic-logo.png')
