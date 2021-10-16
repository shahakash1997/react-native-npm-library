import { NativeModules } from 'react-native';

type NpmLibraryType = {
  multiply(a: number, b: number): Promise<number>;
  showToast(message: string): void;
};

const { NpmLibrary } = NativeModules;

export default NpmLibrary as NpmLibraryType;
